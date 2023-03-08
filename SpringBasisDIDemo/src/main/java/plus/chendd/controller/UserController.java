package plus.chendd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import plus.chendd.service.UserService;

@Controller
public class UserController {

    @Autowired
    @Qualifier(value = "userServiceImpl")
    private UserService userService;

    @Value("${jdbc_username}")
    private String username;

    @Value("${jdbc_password}")
    private String password;

    public void insert() {
        System.out.println("UserController");
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        userService.insert();
    }
}
