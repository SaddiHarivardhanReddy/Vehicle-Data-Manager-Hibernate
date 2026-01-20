package com.codegnan.dao;

import java.util.List;
import com.codegnan.entity.Vehicle;

public interface VehicleDao {

    void addVehicle(Vehicle v);

    Vehicle getVehicle(int id);

    List<Vehicle> getAllVehicles();
}
