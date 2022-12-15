package com.lihh;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test001 {
    public static void main(String[] args) throws Exception {

        // 1. 加载驱动 Driver
//        Driver driver = new com.mysql.cj.jdbc.Driver();

        // 2. 注册驱动 DriverManager
//        DriverManager.registerDriver(driver);
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 3. 获取连接
        /*
         *
         * user:用户名
         * password:密码
         * url:统一资源定位符 定位我们要连接的数据库的
         *   1协议         jdbc:mysql
         *   2IP          127.0.0.1/localhost
         *   3端口号       3306
         *   4数据库名字   mydb
         *   5参数
         *   协议://ip:端口/资源路径?参数名=参数值&参数名=参数值&....
         *   jdbc:mysql://127.0.0.1:3306/mydb
         * */
        String url="jdbc:mysql://127.0.0.1:3306/mydb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
        String user="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, user, password);

        // 4. 获取对应的Statement
        Statement statement = connection.createStatement();

        // 5. 执行sql 结果
        String sql = "insert into dept values(60,'教学部','北京');";
        int rows = statement.executeUpdate(sql);
        System.out.println("影响的数据有：" + rows + "条");

        // 6. 释放资源
        statement.close();
        connection.close();
    }
}
