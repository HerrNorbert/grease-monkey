package com.example.greasemonkey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class CustomerController {

    @GetMapping("new-order")
    public Long newCUstomer(@RequestParam Integer servicecode) {
        return 1L;
    }

    @GetMapping("is-ready")
    public String enquiry(@RequestParam String question, @RequestParam Integer carId) {
        return "not yet";
    }

    @GetMapping("get-now")
    public String angry(@RequestParam Integer carId) {
        return carId + " returned";
    }

    @GetMapping("all-info")
    public String into() {
        return "id: 1, ready \n id: 2, not yet";
    }
}
