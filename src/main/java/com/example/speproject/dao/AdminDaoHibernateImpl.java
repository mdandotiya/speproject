package com.example.speproject.dao;

import com.example.speproject.entity.Admin;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import org.hibernate.query.Query;

@Repository
public class AdminDaoHibernateImpl implements AdminDao {
    private EntityManager entityManager;

    @Autowired
    public AdminDaoHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public Admin findByusername() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Admin> query = currentSession.createQuery("from Admin where username='hardik'", Admin.class);
        Admin admin = query.getSingleResult();
        return admin;
    }
}
