package com.example.speproject.dao;

import com.example.speproject.entity.Patient;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;

@Repository
public class PatientDaoHibernateImpl implements PatientDao{

    private EntityManager entityManager;

    @Autowired
    public PatientDaoHibernateImpl(EntityManager entityManager){ this.entityManager=entityManager;}


    @Override
    public List<Patient> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        List<Patient> patientList = new ArrayList<Patient>();
        Query<Patient> query = currentSession.createQuery("from Patient",Patient.class);
        patientList = query.getResultList();
        return patientList;

    }
}
