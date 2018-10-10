package com.midas.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.midas.model.UserRegister;

@RestController
@RequestMapping("/users")
public class UserLogIn {
	
	@Autowired
	 BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserLogIn() {
    	
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody UserRegister user) {
    	System.out.println(user.getPassword());
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        
    }
}

