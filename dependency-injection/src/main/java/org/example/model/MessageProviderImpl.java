package org.example.model;

import org.springframework.stereotype.Component;

@Component("provider")
public class MessageProviderImpl implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
