package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HController {


    public void hello(@RequestParam("name")String name){

    }
}
