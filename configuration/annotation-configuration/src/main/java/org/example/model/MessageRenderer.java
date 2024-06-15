package org.example.model;

import org.example.model.MessageProvider;

public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider messageProvider);

    MessageProvider getMessageProvider();
}
