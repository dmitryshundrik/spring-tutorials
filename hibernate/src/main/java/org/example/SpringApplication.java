package org.example;

import org.example.config.RootConfiguration;
import org.example.model.Singer;
import org.example.service.SingerService;
import org.example.service.SingerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfiguration.class);
        SingerService singerService = context.getBean("singerService", SingerServiceImpl.class);
        singerService.createSinger("Beyoncé", "You won't break my soul!");
        Singer singer = singerService.findById(1L);
        singerService.sing(singer);
    }
}