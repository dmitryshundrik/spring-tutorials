package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class MessageRendererImpl implements MessageRenderer {

    /**
     * Конфигурирование внедрения зависимостей через поле.
     */
    @Autowired
    private MessageProvider messageProvider;

    /**
     * Конфигурирование внедрения зависимостей через конструктор.
     */
    @Autowired
    public MessageRendererImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }

    /**
     * Конфигурирование внедрения зависимостей через метод установки.
     */
    @Override
    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
