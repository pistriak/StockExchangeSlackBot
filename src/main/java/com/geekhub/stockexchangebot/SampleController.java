package com.geekhub.stockexchangebot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/welcome/{name}")
    public String welcome(@PathVariable String name) {
        return String.format("Welcome %s", name);
    }
}
