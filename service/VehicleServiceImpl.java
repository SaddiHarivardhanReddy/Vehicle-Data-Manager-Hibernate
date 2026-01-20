package com.codegnan.service;

import java.util.List;

import com.codegnan.dao.*;
import com.codegnan.entity.Vehicle;

public class VehicleServiceImpl implements VehicleService {

    VehicleDao dao = new VehicleDaoImpl();

    public void addVehicle(Vehicle v) {
        dao.addVehicle(v);
    }

    public Vehicle searchVehicle(int id) {
        return dao.getVehicle(id);
    }

    public List<Vehicle> viewAll() {
        return dao.getAllVehicles();
    }
}
