package com.example.grpc.supervisor;

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
    comments = "Source: SupervisorService.proto")
public final class SupervisorServiceGrpc {

  private SupervisorServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.supervisor.SupervisorService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest,
      com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> METHOD_FETCH_SUPERVISOR_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest, com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.supervisor.SupervisorService", "FetchSupervisorById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor,
      com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> METHOD_CREATE_SUPERVISOR =
      io.grpc.MethodDescriptor.<com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor, com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.supervisor.SupervisorService", "CreateSupervisor"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor,
      com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> METHOD_UPDATE_SUPERVISOR =
      io.grpc.MethodDescriptor.<com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor, com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.supervisor.SupervisorService", "UpdateSupervisor"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest,
      com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> METHOD_DELETE_SUPERVISOR_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest, com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.supervisor.SupervisorService", "DeleteSupervisorById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SupervisorServiceStub newStub(io.grpc.Channel channel) {
    return new SupervisorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SupervisorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SupervisorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SupervisorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SupervisorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SupervisorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Fetch a supervisor by ID
     * </pre>
     */
    public void fetchSupervisorById(com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_SUPERVISOR_BY_ID, responseObserver);
    }

    /**
     * <pre>
     * Create a new supervisor
     * </pre>
     */
    public void createSupervisor(com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request,
        io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SUPERVISOR, responseObserver);
    }

    /**
     * <pre>
     * Update a supervisor's data
     * </pre>
     */
    public void updateSupervisor(com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request,
        io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SUPERVISOR, responseObserver);
    }

    /**
     * <pre>
     * Delete a supervisor by ID
     * </pre>
     */
    public void deleteSupervisorById(com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SUPERVISOR_BY_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FETCH_SUPERVISOR_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest,
                com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>(
                  this, METHODID_FETCH_SUPERVISOR_BY_ID)))
          .addMethod(
            METHOD_CREATE_SUPERVISOR,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor,
                com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>(
                  this, METHODID_CREATE_SUPERVISOR)))
          .addMethod(
            METHOD_UPDATE_SUPERVISOR,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor,
                com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>(
                  this, METHODID_UPDATE_SUPERVISOR)))
          .addMethod(
            METHOD_DELETE_SUPERVISOR_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest,
                com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>(
                  this, METHODID_DELETE_SUPERVISOR_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class SupervisorServiceStub extends io.grpc.stub.AbstractStub<SupervisorServiceStub> {
    private SupervisorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SupervisorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupervisorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SupervisorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a supervisor by ID
     * </pre>
     */
    public void fetchSupervisorById(com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FETCH_SUPERVISOR_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new supervisor
     * </pre>
     */
    public void createSupervisor(com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request,
        io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SUPERVISOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a supervisor's data
     * </pre>
     */
    public void updateSupervisor(com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request,
        io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SUPERVISOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a supervisor by ID
     * </pre>
     */
    public void deleteSupervisorById(com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SUPERVISOR_BY_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SupervisorServiceBlockingStub extends io.grpc.stub.AbstractStub<SupervisorServiceBlockingStub> {
    private SupervisorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SupervisorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupervisorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SupervisorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a supervisor by ID
     * </pre>
     */
    public com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse fetchSupervisorById(com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FETCH_SUPERVISOR_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new supervisor
     * </pre>
     */
    public com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse createSupervisor(com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SUPERVISOR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a supervisor's data
     * </pre>
     */
    public com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse updateSupervisor(com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SUPERVISOR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a supervisor by ID
     * </pre>
     */
    public com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse deleteSupervisorById(com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SUPERVISOR_BY_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SupervisorServiceFutureStub extends io.grpc.stub.AbstractStub<SupervisorServiceFutureStub> {
    private SupervisorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SupervisorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupervisorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SupervisorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a supervisor by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> fetchSupervisorById(
        com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FETCH_SUPERVISOR_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new supervisor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> createSupervisor(
        com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SUPERVISOR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a supervisor's data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> updateSupervisor(
        com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SUPERVISOR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a supervisor by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> deleteSupervisorById(
        com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SUPERVISOR_BY_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_SUPERVISOR_BY_ID = 0;
  private static final int METHODID_CREATE_SUPERVISOR = 1;
  private static final int METHODID_UPDATE_SUPERVISOR = 2;
  private static final int METHODID_DELETE_SUPERVISOR_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SupervisorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SupervisorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_SUPERVISOR_BY_ID:
          serviceImpl.fetchSupervisorById((com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>) responseObserver);
          break;
        case METHODID_CREATE_SUPERVISOR:
          serviceImpl.createSupervisor((com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SUPERVISOR:
          serviceImpl.updateSupervisor((com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUPERVISOR_BY_ID:
          serviceImpl.deleteSupervisorById((com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse>) responseObserver);
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

  private static final class SupervisorServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.supervisor.SupervisorServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SupervisorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SupervisorServiceDescriptorSupplier())
              .addMethod(METHOD_FETCH_SUPERVISOR_BY_ID)
              .addMethod(METHOD_CREATE_SUPERVISOR)
              .addMethod(METHOD_UPDATE_SUPERVISOR)
              .addMethod(METHOD_DELETE_SUPERVISOR_BY_ID)
              .build();
        }
      }
    }
    return result;
  }
}
