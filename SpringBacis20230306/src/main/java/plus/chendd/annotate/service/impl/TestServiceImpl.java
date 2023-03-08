package plus.chendd.annotate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plus.chendd.annotate.dao.TestDao;
import plus.chendd.annotate.service.TestService;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public void insert() {
        System.out.println("我是 TestServiceImpl insert方法");
        testDao.insert();
    }
}
