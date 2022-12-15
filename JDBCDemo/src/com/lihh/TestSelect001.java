package com.lihh;

import com.lihh.entity.Dept;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestSelect001 {

    private static final String url="jdbc:mysql://127.0.0.1:3306/mydb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
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
//        deleteData();
        updateData();
    }

    public static List<Dept> testSelect() throws Exception {

        // 2. 获取链接
        Connection connection = DriverManager.getConnection(url, user, password);
        List<Dept> result = new ArrayList<>();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from dept;");
        while (resultSet.next()) {
            Integer deptNo = resultSet.getInt("deptno");
            String dname = resultSet.getString("dname");
            String loc = resultSet.getString("loc");

            result.add(new Dept(deptNo, dname, loc));
        }

        return result;
    }

    public static List<Dept> testPrepare() throws Exception{
        List<Dept> result = new ArrayList<>();
        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement("select * from dept;");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Integer deptNo = resultSet.getInt("deptno");
            String dname = resultSet.getString("dname");
            String loc = resultSet.getString("loc");

            result.add(new Dept(deptNo, dname, loc));
        }
        return result;
    }

    public static void deleteData() throws Exception {
        // 获取链接
        Connection connection = DriverManager.getConnection(url, user, password);

        // 生成preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement("delete from dept where deptno = ?");
        // 设置条件
        preparedStatement.setInt(1, 60);

        // 开始执行删除
        int rows = preparedStatement.executeUpdate();
        System.out.println("删除影响的数据有：" + rows);
    }

    public static void updateData() throws Exception {
        Connection connection = DriverManager.getConnection(
                url,
                user,
                password
        );

        PreparedStatement preparedStatement = connection.prepareStatement("update dept set loc = '北京1' where deptno = ?");
        preparedStatement.setInt(1, 50);

        int rows = preparedStatement.executeUpdate();
        System.out.println("更新影响的数据有：" + rows);
    }

}
