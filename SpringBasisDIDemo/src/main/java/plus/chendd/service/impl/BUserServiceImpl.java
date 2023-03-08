package plus.chendd.service.impl;

import org.springframework.stereotype.Service;
import plus.chendd.service.UserService;

@Service
public class BUserServiceImpl implements UserService {
    @Override
    public void insert() {
        System.out.println("BUserServiceImpl insert");
    }
}
