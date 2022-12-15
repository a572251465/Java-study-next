package com.lihh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestBatch {
    private static final String url="jdbc:mysql://127.0.0.1:3306/mydb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true&useServerPrepStmts=true&cachePrepStmts=true&&rewriteBatchedStatements=true";
    private static final String user="root";
    private static final String password="root";
    private static final String driver = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        batch();
    }

    public static void batch() throws Exception{
        Connection connection = DriverManager.getConnection(url, user, password);

        PreparedStatement preparedStatement = connection.prepareStatement("insert into dept values(null, ?, ?)");

        for (int i = 1; i <= 10663; i += 1) {
            preparedStatement.setString(1, "name");
            preparedStatement.setString(2, "loc");
            preparedStatement.addBatch();

            if (i % 1000 == 0) {
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }

        preparedStatement.executeBatch();
        preparedStatement.clearBatch();
        System.out.println("批处理执行成功");

        preparedStatement.close();
        connection.close();
    }
}
