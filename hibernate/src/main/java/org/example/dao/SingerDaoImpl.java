package org.example.dao;

import org.example.model.Singer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("singerDao")
public class SingerDaoImpl implements SingerDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public SingerDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Singer singer) {
        Session session = sessionFactory.openSession();
        session.save(singer);
        session.close();
    }

    @Override
    public Singer findById(Long singerId) {
        Session session = sessionFactory.openSession();
        Singer singer = session.get(Singer.class, singerId);
        session.close();
        return singer;
    }

    @Override
    public List<Singer> findAll() {
        Session session = sessionFactory.openSession();
        List<Singer> singerList = session.createQuery("from Singer", Singer.class).getResultList();
        session.close();
        return singerList;
    }

    @Override
    public void deleteById(Long singerId) {
        Session session = sessionFactory.openSession();
        session.remove(findById(singerId));
        session.close();
    }
}
