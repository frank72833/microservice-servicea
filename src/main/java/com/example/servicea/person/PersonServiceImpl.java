package com.example.servicea.person;

import io.grpc.stub.StreamObserver;

public class PersonServiceImpl extends PersonServiceGrpc.PersonServiceImplBase {

    public void getPersonById(PersonRequestId request, StreamObserver<PersonResponse> responseObserver) {
        PersonResponse response = PersonResponse.newBuilder()
                .setId(request.getId())
                .setName("Fran")
                .setSurname("Test")
                .setCarId("2343LGM")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void getPersonByCarId(PersonRequestCarId request, StreamObserver<PersonResponse> responseObserver) {
        PersonResponse response = PersonResponse.newBuilder()
                .setId("201")
                .setName("Fran")
                .setSurname("Driver")
                .setCarId(request.getCarId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
