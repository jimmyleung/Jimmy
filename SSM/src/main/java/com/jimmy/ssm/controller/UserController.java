package com.jimmy.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public void login(){

    }

    public static void main(String[] args){
        System.out.println("Hello IntellJ Idea");
    }

}
