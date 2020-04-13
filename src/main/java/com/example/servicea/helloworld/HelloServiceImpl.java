package com.example.servicea.helloworld;

import io.grpc.stub.StreamObserver;

import java.util.StringJoiner;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        StringJoiner st = new StringJoiner(" ");
        st.add("Hello");
        st.add(request.getFirstName());
        st.add(request.getLastName());

        HelloResponse response = HelloResponse.newBuilder().setGreeting(st.toString()).build();

        responseObserver.onNext(response);
    }
}
