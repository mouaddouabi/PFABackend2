package com.PfaBackend.controllers;

import com.PfaBackend.beans.User;
//import com.PfaBackend.exceptions.UserExist;
import com.PfaBackend.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserServices userServices;
    @GetMapping("/{email}/{password}")
    public User connecter(@PathVariable("email")String email,@PathVariable("password")String password){
        return userServices.login(email,password);
    }
   /* @PostMapping({"","/"})
    public User creerCompte(@RequestBody User user){
         User user2=null;
        try {
            user2= userServices.Signin(user);
        } catch (UserExist userExist) {
            user2=null;
        }
        return user2;
    }*/
   @GetMapping("/{email}")
   public User searchbyEmail(@PathVariable("email")String email){
       return userServices.findByemail(email);
   }
    @PutMapping("/{id}")
    public User modifierInfo(@PathVariable("id")Long id,@RequestBody User user){return userServices.upadateinfos(id,user); }

    @PutMapping("updatepass/{id}")
    public User modifierpass(@PathVariable("id")Long id,@RequestBody String pwd){
       return userServices.updatePass(id,pwd);
    }

}

