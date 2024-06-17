package org.example.dao;

import org.example.model.Singer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("jpaSingerDao")
public class SingerDaoImpl implements SingerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Singer singer) {
        entityManager.persist(singer);
    }

    @Override
    public Singer findById(Long singerId) {
        return entityManager.find(Singer.class, singerId);
    }

    @Override
    public List<Singer> findAll() {
        return entityManager.createNamedQuery("Singer.findAll", Singer.class).getResultList();
    }

    @Override
    public void deleteById(Long singerId) {
        entityManager.remove(findById(singerId));
    }
}
