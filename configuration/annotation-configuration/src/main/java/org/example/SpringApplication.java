package org.example;

import org.example.model.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/app-context-annotation.xml");
        context.refresh();
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();
        context.close();
    }
}