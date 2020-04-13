package com.example.serviceb.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/car")
public class CarResource {

    private CarServiceProvider carServiceProvider;

    @Autowired
    public CarResource(CarServiceProvider carServiceProvider) {
        this.carServiceProvider = carServiceProvider;
    }

    @GetMapping("/{id}")
    CarResponse getCar(@PathVariable String id) {
        return carServiceProvider.getCarResponse(id);
    }
}
