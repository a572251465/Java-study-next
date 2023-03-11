package plus.chendd.dao;

public interface UserDao {
    int addUser(String id, String name);
    void updateUser(String id, String name);
}
