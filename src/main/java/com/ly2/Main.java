package com.ly2;

import com.ly2.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ly2/spring-config.xml");
        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService.getBooks().size());
    }
}
