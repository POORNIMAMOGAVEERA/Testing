package org.example;

import com.google.inject.Guice;
import io.grpc.stub.StreamObserver;
import org.proto.example.MyGRPCServiceGrpc;
import org.proto.example.PerformOperationRequest;
import org.proto.example.PerformOperationResponse;

public class MyGRPCService extends MyGRPCServiceGrpc.MyGRPCServiceImplBase {
    @Override
    public void performOperation(PerformOperationRequest request, StreamObserver<PerformOperationResponse> responseObserver) {
        MyService myService = Guice.createInjector(new MyModule()).getInstance(MyService.class);
        String result = myService.performOperation();
        PerformOperationResponse response = PerformOperationResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
