package com.example.speproject.dao;

import com.example.speproject.entity.Attendent;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AttendentDaoHibernateImpl implements AttendentDao{

    private EntityManager entityManager;

    @Autowired
    public AttendentDaoHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Attendent> findAll() {
        Session currentSession =entityManager.unwrap(Session.class);
        List<Attendent> attendentList;
        Query<Attendent> query = currentSession.createQuery("from Attendent",Attendent.class);
        attendentList = query.getResultList();
        return attendentList;
    }
}
