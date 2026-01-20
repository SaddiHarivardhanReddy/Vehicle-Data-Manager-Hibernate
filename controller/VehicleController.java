package com.codegnan.controller;

import java.util.List;
import java.util.Scanner;

import com.codegnan.entity.Vehicle;
import com.codegnan.service.*;

public class VehicleController {

    public static void main(String[] args) {

        VehicleService service = new VehicleServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- VEHICLE MANAGEMENT ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Search Vehicle");
            System.out.println("3. View All Vehicles");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Brand: ");
                String brand = sc.next();

                System.out.print("Model: ");
                String model = sc.next();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                service.addVehicle(new Vehicle(brand, model, price));
                System.out.println("Vehicle Added");
                break;

            case 2:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                Vehicle v = service.searchVehicle(id);
                if (v == null)
                    System.out.println("Vehicle Not Found");
                else
                    System.out.println(
                            v.getId() + " " +
                            v.getBrand() + " " +
                            v.getModel() + " " +
                            v.getPrice());
                break;

            case 3:
                List<Vehicle> list = service.viewAll();
                for (Vehicle ve : list) {
                    System.out.println(
                            ve.getId() + " " +
                            ve.getBrand() + " " +
                            ve.getModel() + " " +
                            ve.getPrice());
                }
                break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        }
    }
}
