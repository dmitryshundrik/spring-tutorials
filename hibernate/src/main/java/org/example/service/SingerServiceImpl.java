package org.example.service;

import org.example.dao.SingerDao;
import org.example.model.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("singerService")
@Transactional
public class SingerServiceImpl implements SingerService {

    private final SingerDao singerDao;

    @Autowired
    public SingerServiceImpl(SingerDao singerDao) {
        this.singerDao = singerDao;
    }

    @Override
    public Singer createSinger(String name, String lyric) {
        Singer singer = new Singer();
        singer.setName(name);
        singer.setLyric(lyric);
        singerDao.save(singer);
        return singer;
    }

    @Override
    @Transactional(readOnly = true)
    public Singer findById(Long singerId) {
        return singerDao.findById(singerId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Singer> findAll() {
        return singerDao.findAll();
    }

    public void sing(Singer singer) {
        System.out.println(singer.getName() + ": " + singer.getLyric());
    }
}
