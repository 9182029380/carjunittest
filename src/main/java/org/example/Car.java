package org.example;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public int id;
    public String brand;
    public String model;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "bmw", "xcw"));
        cars.add(new Car(2, "bmw", "xcw"));
        cars.add(new Car(3, "bmw", "xcw"));
        cars.add(new Car(4, "bmw", "xcw"));
        int serachId=41;
        Car foundCar = findCarById(cars,serachId);
        if (foundCar != null){
            System.out.println("car found");
            System.out.println("id: " + foundCar.getId());
            System.out.println("brand: " + foundCar.getBrand());
            System.out.println("model: " + foundCar.getModel());
        }else{
            System.out.println("car with id"+" "+serachId+" not found");
        }
    }

    static Car findCarById(List<Car> cars, int Id) {
        for (Car car : cars) {
            if (car.getId()== Id) {
                return car;
            }
        }
        return null;
    }

}
