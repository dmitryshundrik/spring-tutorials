package org.example.dao;

import org.example.model.Singer;

import java.util.List;

public interface SingerDao {
    void save(Singer singer);

    Singer findById(Long singerId);

    List<Singer> findAll();

    void deleteById(Long singerId);
}
