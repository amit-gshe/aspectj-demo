package com.example.aspectjdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Man {

    @Autowired
    private UserService userService;

    public void sayHello(){
        userService.hello();
    }

}
