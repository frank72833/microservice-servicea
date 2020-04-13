package com.example.serviceb.car;

import com.example.serviceb.person.PersonResponse;

import java.util.List;

public class CarResponse {
    Car car;
    List<PersonResponse> drivers;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<PersonResponse> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<PersonResponse> drivers) {
        this.drivers = drivers;
    }
}
