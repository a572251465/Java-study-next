package com.lihh.dao.pojo;

import org.springframework.beans.factory.FactoryBean;

public class BookFactory implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setName("十万个为什么");
        book.setAuthor("lihh");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
