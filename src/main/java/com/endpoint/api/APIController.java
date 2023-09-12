package com.endpoint.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("")
    public Details printDetails(@RequestParam(value="slack_name") String slack_name, @RequestParam(value="track") String track){
        Details dts = new Details(slack_name,track);
        return dts;
    }
}
