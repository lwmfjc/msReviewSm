package com.ly1;

import com.ly1.config.LyConfig;
import com.ly1.entity.ProjectInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context=new ClassPathXmlApplicationContext("ly1/spring-context.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(LyConfig.class);
        ProjectInfo projectInfo = context.getBean(ProjectInfo.class);
        System.out.println(projectInfo);
    }
}
