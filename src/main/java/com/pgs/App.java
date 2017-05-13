package com.pgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Luke on 2017-05-12.
 */
@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String getUsers(){
        return "Users";
    }
}
