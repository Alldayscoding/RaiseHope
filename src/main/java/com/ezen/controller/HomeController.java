package com.ezen.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@Slf4j
public class HomeController {

    @RequestMapping("")
    public String home() {
        return "main";
    }

    @RequestMapping("donation")
    public String donation() {
        return "donation";
    }

    @RequestMapping("donationList")
    public String donationList() {
        return "donationList";
    }
}