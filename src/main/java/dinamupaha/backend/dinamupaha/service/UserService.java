package dinamupaha.backend.dinamupaha.service;

import dinamupaha.backend.dinamupaha.jwt.JwtUtil;
import dinamupaha.backend.dinamupaha.model.User;
import dinamupaha.backend.dinamupaha.repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@Service
@Slf4j
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
    @Autowired
    private JwtUtil jwtUtil;
    private User userDetails;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        userDetails=userRepo.findByEmail(username);
        if(!Objects.isNull(userDetails)){
            return new org.springframework.security.core.userdetails.User(userDetails.getEmail(), userDetails.getPassword(), new ArrayList<>());
        }
        else{
            throw new UsernameNotFoundException("User Not Found");
        }
    }

    public User getUserDetails(){
        return userDetails;
    }

    public Integer signUp(User user){
        try{
            User newUser = userRepo.findByEmail(user.getEmail());
            Random rnd = new Random();
            int number = rnd.nextInt(10000);
            user.setVerificationCode(number);
            if(Objects.isNull(newUser)){
                userRepo.save(setObject(user));
//                return "reistration successful";
                return 0;
            }
            else{
//                return "your email is already used";
                return 1;
            }
        }catch (Exception ex){

        }
//        return "something went wrong";
        return 2;
    }

    public int getVerificationCode(String email){
        User user = userRepo.findByEmail(email);
        return user.getVerificationCode();

//        return 1;
    }

    public User setObject(User user){
        return new User(user.getFirstName(),
                        user.getLastName(),
                        user.getDob(),
                        user.getEmail(),
                        user.getMobileNumber(),
                        user.getHomeDistrict(),
                        user.getDivisionalSecretory(),
                        user.getExaminationYear(),
                        passwordEncoder.encode(user.getPassword()),
                        user.getSchool(),
                        user.getDistrictOfSchool(),
                        user.getRole(),
                        user.getVerificationCode());

    }

    public ResponseEntity<String> login(String email, String password){
        try{
            JSONObject jsonObject = new JSONObject();

            Authentication auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
            if(auth.isAuthenticated()){
                jsonObject.put("token", jwtUtil.generateToken(getUserDetails().getEmail(), getUserDetails().getPassword()));
                jsonObject.put("name", getUserDetails().getEmail());

                return new ResponseEntity<String>(jsonObject.toString(), HttpStatus.OK);
            }


        }catch(Exception ex) {
            log.error("{}", ex);
        }
        return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);

    }

    public String forgetPassword(String email){
        return "mail was sent";
    }

    public User passUserData(String email){
        return userRepo.findByEmail(email);
    }

    public String editUserData(User user){
        return null;
    }

    public Boolean verifyUser(String email, int code){
        User user = userRepo.findByEmail(email);
        userRepo.deleteById(user.getId());
        user.setVerificationCode(0);
        user.setVerified(true);
        userRepo.save(user);
        return true;
    }

}