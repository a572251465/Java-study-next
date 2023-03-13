package plus.chendd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/testHello")
    public String testHello() {
        System.out.println("TestController testHello invoked ...");
        return "testHello";
    }
}
