package org.example;

import org.example.config.HibernateConfiguration;
import org.example.model.Singer;
import org.example.service.SingerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
        SingerService singerService = context.getBean("singerService", SingerService.class);
        singerService.createSinger("Beyoncé", "You won't break my soul!");
        Singer singer = singerService.findById(1L);
        singerService.sing(singer);
    }
}