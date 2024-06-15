package org.example.service;

import org.example.model.Singer;

import java.util.List;

public interface SingerService {
    Singer createSinger(String name, String lyric);

    Singer findById(Long singerId);

    List<Singer> findAll();

    void sing(Singer singer);
}
