package org.example.config;

import org.example.model.MessageProvider;
import org.example.model.MessageProviderImpl;
import org.example.model.MessageRenderer;
import org.example.model.MessageRendererImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Конфигурационный класс может служить и для чтения определений компонентов Spring Beans, снабженных аннотациями. Это
 * делается с помощью аннотации @ComponentScan. В данном случае методы с аннотациями @Bean в конфигурационном классе не
 * потребуются.
 */
@Configuration
@ComponentScan(basePackages = "org.example")
public class RootConfiguration {

    @Bean
    public MessageProvider provider() {
        return new MessageProviderImpl();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new MessageRendererImpl();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
