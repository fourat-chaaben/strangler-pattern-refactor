package io.github.fouratchaaben.stranglerpattern.loginmicroservice.Controller;

import io.github.fouratchaaben.stranglerpattern.loginmicroservice.Tweet;
import io.github.fouratchaaben.stranglerpattern.loginmicroservice.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @PostMapping("/performLogin")
    public String authenticateUser(@RequestBody User user) {
        if ("user".equals(user.getUserName()) && "passw".equals(user.getPassword())) {
            return "Login was successful!";
        } else {
            return "Login unsuccessful! Invalid credentials.";
        }
    }

}
