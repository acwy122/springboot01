package com.springboot.springboot01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/index")
    public String index(String posId) {
        return "hello springboot!!!!!" + posId;
    }

}
