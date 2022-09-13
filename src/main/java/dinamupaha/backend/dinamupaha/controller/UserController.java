package dinamupaha.backend.dinamupaha.controller;

import dinamupaha.backend.dinamupaha.jwt.Encryptor;
import dinamupaha.backend.dinamupaha.model.Email;
import dinamupaha.backend.dinamupaha.model.User;
import dinamupaha.backend.dinamupaha.service.EmailService;
import dinamupaha.backend.dinamupaha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @Autowired
    private Encryptor encryptor;

    @PostMapping("/user/signup")
    public Boolean signup(@RequestBody User user) {
        try {
            int check = userService.signUp(user);
            if(check == 0){
//                String msgBody = "http://localhost:8080/user/test/"+encryptor.encryptString(user.getEmail());
                int msgBody = userService.getVerificationCode(user.getEmail());
                String msgBodyStr = Integer.toString(msgBody);
                Email verificationMail = new Email();

                verificationMail.setRecipient(user.getEmail());
                verificationMail.setMsgBody(msgBodyStr);
                verificationMail.setSubject("Dinamupaha Verification");

                emailService.sendSimpleMail(verificationMail);
                return true;
            }
            else{
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @PostMapping("/user/mailverify")
    public Boolean mailVerify(@RequestBody User user){
        return userService.verifyUser(user.getEmail(), user.getVerificationCode());
    }


    @PostMapping("/user/login")
    public ResponseEntity<String> login(@RequestBody User user){
        try{
            return userService.login(user.getEmail(), user.getPassword());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return  new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @PostMapping("/user/forgetpassword")
    public String forgetPassword(@RequestBody User user){
        userService.forgetPassword(user.getEmail());
        return "mail was sent";
    }

    @PostMapping("/user/editprofilegetdata")
    public User editProfileGetData(@RequestBody String email){
        return userService.passUserData(email);
    }

    @PostMapping("/user/editprofile")
    public String editProfilePostData(@RequestBody User user){
        userService.editUserData(user);
        return null;
    }

    @GetMapping("/user/test")
    public String test(){
        return "Tharushan1";
    }
}
