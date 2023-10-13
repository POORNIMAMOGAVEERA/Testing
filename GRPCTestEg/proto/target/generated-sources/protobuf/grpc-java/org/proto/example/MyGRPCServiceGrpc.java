package org.proto.example;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: schema.proto")
public final class MyGRPCServiceGrpc {

  private MyGRPCServiceGrpc() {}

  public static final String SERVICE_NAME = "org.proto.example.MyGRPCService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.proto.example.PerformOperationRequest,
      org.proto.example.PerformOperationResponse> METHOD_PERFORM_OPERATION =
      io.grpc.MethodDescriptor.<org.proto.example.PerformOperationRequest, org.proto.example.PerformOperationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.proto.example.MyGRPCService", "PerformOperation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.proto.example.PerformOperationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.proto.example.PerformOperationResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyGRPCServiceStub newStub(io.grpc.Channel channel) {
    return new MyGRPCServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyGRPCServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MyGRPCServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyGRPCServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MyGRPCServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MyGRPCServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define a RPC method
     * </pre>
     */
    public void performOperation(org.proto.example.PerformOperationRequest request,
        io.grpc.stub.StreamObserver<org.proto.example.PerformOperationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PERFORM_OPERATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PERFORM_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                org.proto.example.PerformOperationRequest,
                org.proto.example.PerformOperationResponse>(
                  this, METHODID_PERFORM_OPERATION)))
          .build();
    }
  }

  /**
   */
  public static final class MyGRPCServiceStub extends io.grpc.stub.AbstractStub<MyGRPCServiceStub> {
    private MyGRPCServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyGRPCServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyGRPCServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyGRPCServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC method
     * </pre>
     */
    public void performOperation(org.proto.example.PerformOperationRequest request,
        io.grpc.stub.StreamObserver<org.proto.example.PerformOperationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PERFORM_OPERATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MyGRPCServiceBlockingStub extends io.grpc.stub.AbstractStub<MyGRPCServiceBlockingStub> {
    private MyGRPCServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyGRPCServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyGRPCServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyGRPCServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC method
     * </pre>
     */
    public org.proto.example.PerformOperationResponse performOperation(org.proto.example.PerformOperationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PERFORM_OPERATION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MyGRPCServiceFutureStub extends io.grpc.stub.AbstractStub<MyGRPCServiceFutureStub> {
    private MyGRPCServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyGRPCServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyGRPCServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyGRPCServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.proto.example.PerformOperationResponse> performOperation(
        org.proto.example.PerformOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PERFORM_OPERATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_PERFORM_OPERATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyGRPCServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyGRPCServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORM_OPERATION:
          serviceImpl.performOperation((org.proto.example.PerformOperationRequest) request,
              (io.grpc.stub.StreamObserver<org.proto.example.PerformOperationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class MyGRPCServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.proto.example.Schema.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MyGRPCServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyGRPCServiceDescriptorSupplier())
              .addMethod(METHOD_PERFORM_OPERATION)
              .build();
        }
      }
    }
    return result;
  }
}
