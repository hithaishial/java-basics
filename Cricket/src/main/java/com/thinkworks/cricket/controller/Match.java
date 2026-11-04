package com.thinkworks.cricket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class Match {

    public Match() {
        System.out.println("running match");
    }

    @RequestMapping("/book")
    public String userDetails(@RequestParam String userName,
                              @RequestParam String email,
                              @RequestParam String phoneNumber,
                              @RequestParam String seatNumber,
                              @RequestParam String matchDate,
                              @RequestParam String matchTimings) {

        System.out.println("Username: " + userName +
                "\nEmail: " + email +
                "\nPhone Number: " + phoneNumber +
                "\nSeat Number: " + seatNumber +
                "\nMatch Date: " + matchDate +
                "\nMatch Timings: " + matchTimings);

        return "index.jsp";
    }
}