package com.nanshan.controller;

import com.nanshan.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/aysnc1")
    public String async1(){
        asyncService.sendMsg("test");
        return "aysnc1";
    }
}
