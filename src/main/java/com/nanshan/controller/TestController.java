package com.nanshan.controller;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class TestController {

    @GetMapping("/get_hello")
    public String test(){
        return "get_hello nanshan Spring!";
    }

    @PostMapping("/post_hello")
    public String testpost(){
        return "post_hello nanshan Spring!";
    }

    @GetMapping("/get_hello/{userId}/{password}")
    public String testPara(@PathVariable String userId,@PathVariable String password){
        return "get_hello userId =" + userId + "  ;password = " + password;
    }

}
