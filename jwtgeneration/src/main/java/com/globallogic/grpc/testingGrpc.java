package com.globallogic.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: jwt.proto")
public final class testingGrpc {

  private testingGrpc() {}

  public static final String SERVICE_NAME = "testing";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.globallogic.grpc.Jwt.credential,
      com.globallogic.grpc.Jwt.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.globallogic.grpc.Jwt.credential.class,
      responseType = com.globallogic.grpc.Jwt.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.globallogic.grpc.Jwt.credential,
      com.globallogic.grpc.Jwt.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.globallogic.grpc.Jwt.credential, com.globallogic.grpc.Jwt.APIResponse> getLoginMethod;
    if ((getLoginMethod = testingGrpc.getLoginMethod) == null) {
      synchronized (testingGrpc.class) {
        if ((getLoginMethod = testingGrpc.getLoginMethod) == null) {
          testingGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.globallogic.grpc.Jwt.credential, com.globallogic.grpc.Jwt.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "testing", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.grpc.Jwt.credential.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.grpc.Jwt.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new testingMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static testingStub newStub(io.grpc.Channel channel) {
    return new testingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static testingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new testingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static testingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new testingFutureStub(channel);
  }

  /**
   */
  public static abstract class testingImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.globallogic.grpc.Jwt.credential request,
        io.grpc.stub.StreamObserver<com.globallogic.grpc.Jwt.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.globallogic.grpc.Jwt.credential,
                com.globallogic.grpc.Jwt.APIResponse>(
                  this, METHODID_LOGIN)))
          .build();
    }
  }

  /**
   */
  public static final class testingStub extends io.grpc.stub.AbstractStub<testingStub> {
    private testingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private testingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected testingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new testingStub(channel, callOptions);
    }

    /**
     */
    public void login(com.globallogic.grpc.Jwt.credential request,
        io.grpc.stub.StreamObserver<com.globallogic.grpc.Jwt.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class testingBlockingStub extends io.grpc.stub.AbstractStub<testingBlockingStub> {
    private testingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private testingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected testingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new testingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.globallogic.grpc.Jwt.APIResponse login(com.globallogic.grpc.Jwt.credential request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class testingFutureStub extends io.grpc.stub.AbstractStub<testingFutureStub> {
    private testingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private testingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected testingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new testingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.globallogic.grpc.Jwt.APIResponse> login(
        com.globallogic.grpc.Jwt.credential request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final testingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(testingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.globallogic.grpc.Jwt.credential) request,
              (io.grpc.stub.StreamObserver<com.globallogic.grpc.Jwt.APIResponse>) responseObserver);
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

  private static abstract class testingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    testingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.globallogic.grpc.Jwt.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("testing");
    }
  }

  private static final class testingFileDescriptorSupplier
      extends testingBaseDescriptorSupplier {
    testingFileDescriptorSupplier() {}
  }

  private static final class testingMethodDescriptorSupplier
      extends testingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    testingMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (testingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new testingFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
