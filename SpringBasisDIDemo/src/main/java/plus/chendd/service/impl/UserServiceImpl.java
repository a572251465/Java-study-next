package plus.chendd.service.impl;

import org.springframework.stereotype.Service;
import plus.chendd.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void insert() {
        System.out.println("userServiceImpl insert");
    }
}
