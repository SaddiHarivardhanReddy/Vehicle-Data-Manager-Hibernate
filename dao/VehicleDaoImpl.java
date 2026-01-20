package com.codegnan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.codegnan.entity.Vehicle;
import com.codegnan.util.HibernateUtil;

public class VehicleDaoImpl implements VehicleDao {

    @Override
    public void addVehicle(Vehicle v) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(v);

        tx.commit();
        session.close();
    }

    @Override
    public Vehicle getVehicle(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Vehicle v = session.get(Vehicle.class, id);
        session.close();
        return v;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Vehicle> list =
                session.createQuery("from Vehicle", Vehicle.class).list();
        session.close();
        return list;
    }
}
