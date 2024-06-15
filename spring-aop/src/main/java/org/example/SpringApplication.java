package org.example;

import org.example.config.RootConfiguration;
import org.example.model.Agent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfiguration.class);
        Agent agent = context.getBean("agent", Agent.class);
        agent.speak();
    }
}