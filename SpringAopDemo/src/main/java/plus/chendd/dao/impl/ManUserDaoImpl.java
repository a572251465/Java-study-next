package plus.chendd.dao.impl;

import org.springframework.stereotype.Repository;
import plus.chendd.dao.UserDao;

@Repository
public class ManUserDaoImpl implements UserDao {
    @Override
    public int addUser(String id, String name) {
        System.out.println("addUser ... ...");
        return 1;
    }

    @Override
    public void updateUser(String id, String name) {
        int res = 1/ 0;
        System.out.println(res);
    }
}
