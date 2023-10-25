package com.example.FeignClient.controller;

import com.example.FeignClient.util.AOPUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aopController")
public class AOPController {
    @Autowired
    AOPUtil aopUtil;

    @GetMapping("")
    public ResponseEntity<?> getAllEmployee(){
        return aopUtil.findAllEmployee();
    }
}
