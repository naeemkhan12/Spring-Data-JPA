package com.naeem.main.com.naeem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by naeem on 5/21/17.
 */
@RestController
public class Controller {
    @RequestMapping("/records")
    public String records(){
        return "Responding to Records Url";
    }
}
