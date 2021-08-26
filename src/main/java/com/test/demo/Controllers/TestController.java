package com.test.demo.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> getData(){
        return  ResponseEntity.status(200).body("GithubTest");
    }

    @GetMapping("/test1")
    public ResponseEntity<String> getData1(){
        for(int i=0; i<100; i++)
        {
            System.out.println(i);
        }
        return  ResponseEntity.status(200).body("GithubTest1212222222222222222");
    }
}
