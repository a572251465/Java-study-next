package plus.chendd.annotate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import plus.chendd.annotate.service.TestService;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    public void insert() {
        System.out.println("我是 TestController insert");
        testService.insert();
    }
}
