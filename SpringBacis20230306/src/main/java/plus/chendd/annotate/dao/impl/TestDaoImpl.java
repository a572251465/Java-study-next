package plus.chendd.annotate.dao.impl;

import org.springframework.stereotype.Repository;
import plus.chendd.annotate.dao.TestDao;

@Repository
public class TestDaoImpl implements TestDao {
    @Override
    public void insert() {
        System.out.println("我是 TestDaoImpl insert");
    }
}
