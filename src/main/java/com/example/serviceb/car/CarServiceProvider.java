package com.example.serviceb.car;

import com.example.serviceb.person.PersonRequestCarId;
import com.example.serviceb.person.PersonResponse;
import com.example.serviceb.person.PersonServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CarServiceProvider {

    Map<String, Car> db = new HashMap<>();

    @Autowired
    public CarServiceProvider() {
        Car car = new Car();
        car.setId("2343LGM");
        car.setBrand("Ford");
        car.setModel("Fiesta ST");
        car.setColor("Blue");
        db.put("2343LGM", car);
    }

    public Car getCar(String id) {
        return db.get(id);
    }

    public List<PersonResponse> getPerson(String carId) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        PersonServiceGrpc.PersonServiceBlockingStub stub = PersonServiceGrpc.newBlockingStub(channel);
        PersonRequestCarId request = PersonRequestCarId.newBuilder().setCarId(carId).build();

        List<PersonResponse> response = new ArrayList<>();
        stub.getPersonByCarId(request).forEachRemaining(response::add);

        return response;
    }

    public CarResponse getCarResponse(String id) {
        Car car = getCar(id);
        List<PersonResponse> drivers = getPerson(id);

        CarResponse response = new CarResponse();
        response.setCar(car);
        response.setDrivers(drivers);

        return response;
    }
}
