package com.medos.rates.rates.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CnssRates.PATH)
public class CnssRates {

    public static final String PATH = "/rates";

    @GetMapping("/hello")
    public String getTest() {
        return "TEST UP fuck";
    }

    @GetMapping("/hello/{bast}")
    public String getTestBast(@PathVariable("bast") String bast) {
        return "TEST UP " + bast;
    }

}
