package com.Geekster.URLHitCounter.controller;

import com.Geekster.URLHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlHitController {

    @Autowired
    UrlHitService myservice;

    @PostMapping("api/v1/visitor-count-app")
    public String hitt()
    {

        return  myservice.hitt();
    }
    @GetMapping("count")
    public int getcount()
    {
        return myservice.getcount();
    }



}
