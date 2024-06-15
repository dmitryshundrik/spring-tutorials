package org.example.service;

import org.example.model.Writer;
import org.springframework.stereotype.Service;

@Service("writerService")
public class WriterServiceImpl implements WriterService {
    @Override
    public Writer getWriter() {
        Writer writer = new Writer();
        writer.setName("Fyodor Dostoevsky");
        writer.setQuote("Whether I am a trembling creature or whether I have the right...");
        return writer;
    }
}
