package com.codegnan.service;

import java.util.List;
import com.codegnan.entity.Vehicle;

public interface VehicleService {

    void addVehicle(Vehicle v);

    Vehicle searchVehicle(int id);

    List<Vehicle> viewAll();
}
