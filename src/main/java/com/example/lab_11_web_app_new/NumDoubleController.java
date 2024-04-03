package com.example.lab_11_web_app_new;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumDoubleController {
    @GetMapping("/double")

    public int numDoubleController(@RequestParam int number){

        return number * 2;
    }
}
