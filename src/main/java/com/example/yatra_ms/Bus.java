package com.example.yatra_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bus {
    @GetMapping("/Bus")
    public String getData() {return  "Please book your flight ticket from yatra.com on  40% discount" ; }
}