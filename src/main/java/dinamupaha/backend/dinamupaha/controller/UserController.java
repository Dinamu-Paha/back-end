package dinamupaha.backend.dinamupaha.controller;

import dinamupaha.backend.dinamupaha.model.User;
import dinamupaha.backend.dinamupaha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/signup")
    public String signup(@RequestBody User user) {
        try {
            return userService.signUp(user);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

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

    @GetMapping("/user/test")
    public String test(){
        return "tharushan";
    }
}
