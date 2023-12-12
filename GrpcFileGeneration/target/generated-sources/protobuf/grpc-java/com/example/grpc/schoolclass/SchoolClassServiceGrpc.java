package com.example.grpc.schoolclass;

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
    comments = "Source: SchoolClassService.proto")
public final class SchoolClassServiceGrpc {

  private SchoolClassServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.schoolclass.SchoolClassService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest,
      com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> METHOD_FETCH_CLASS_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest, com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.schoolclass.SchoolClassService", "FetchClassById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass,
      com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> METHOD_CREATE_CLASS =
      io.grpc.MethodDescriptor.<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass, com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.schoolclass.SchoolClassService", "CreateClass"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass,
      com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> METHOD_UPDATE_CLASS =
      io.grpc.MethodDescriptor.<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass, com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.schoolclass.SchoolClassService", "UpdateClass"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest,
      com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> METHOD_DELETE_CLASS_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest, com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.schoolclass.SchoolClassService", "DeleteClassById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SchoolClassServiceStub newStub(io.grpc.Channel channel) {
    return new SchoolClassServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SchoolClassServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SchoolClassServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SchoolClassServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SchoolClassServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SchoolClassServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Fetch a class by ID
     * </pre>
     */
    public void fetchClassById(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_CLASS_BY_ID, responseObserver);
    }

    /**
     * <pre>
     * Create a new class
     * </pre>
     */
    public void createClass(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass request,
        io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CLASS, responseObserver);
    }

    /**
     * <pre>
     * Update a class's data
     * </pre>
     */
    public void updateClass(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass request,
        io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CLASS, responseObserver);
    }

    /**
     * <pre>
     * Delete a class by ID
     * </pre>
     */
    public void deleteClassById(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_CLASS_BY_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FETCH_CLASS_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest,
                com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>(
                  this, METHODID_FETCH_CLASS_BY_ID)))
          .addMethod(
            METHOD_CREATE_CLASS,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass,
                com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>(
                  this, METHODID_CREATE_CLASS)))
          .addMethod(
            METHOD_UPDATE_CLASS,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass,
                com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>(
                  this, METHODID_UPDATE_CLASS)))
          .addMethod(
            METHOD_DELETE_CLASS_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest,
                com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>(
                  this, METHODID_DELETE_CLASS_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class SchoolClassServiceStub extends io.grpc.stub.AbstractStub<SchoolClassServiceStub> {
    private SchoolClassServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SchoolClassServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchoolClassServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SchoolClassServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a class by ID
     * </pre>
     */
    public void fetchClassById(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FETCH_CLASS_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new class
     * </pre>
     */
    public void createClass(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass request,
        io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CLASS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a class's data
     * </pre>
     */
    public void updateClass(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass request,
        io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CLASS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a class by ID
     * </pre>
     */
    public void deleteClassById(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_CLASS_BY_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SchoolClassServiceBlockingStub extends io.grpc.stub.AbstractStub<SchoolClassServiceBlockingStub> {
    private SchoolClassServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SchoolClassServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchoolClassServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SchoolClassServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a class by ID
     * </pre>
     */
    public com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse fetchClassById(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FETCH_CLASS_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new class
     * </pre>
     */
    public com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse createClass(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CLASS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a class's data
     * </pre>
     */
    public com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse updateClass(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CLASS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a class by ID
     * </pre>
     */
    public com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse deleteClassById(com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_CLASS_BY_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SchoolClassServiceFutureStub extends io.grpc.stub.AbstractStub<SchoolClassServiceFutureStub> {
    private SchoolClassServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SchoolClassServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchoolClassServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SchoolClassServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a class by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> fetchClassById(
        com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FETCH_CLASS_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new class
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> createClass(
        com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CLASS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a class's data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> updateClass(
        com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CLASS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a class by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse> deleteClassById(
        com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_CLASS_BY_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_CLASS_BY_ID = 0;
  private static final int METHODID_CREATE_CLASS = 1;
  private static final int METHODID_UPDATE_CLASS = 2;
  private static final int METHODID_DELETE_CLASS_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SchoolClassServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SchoolClassServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_CLASS_BY_ID:
          serviceImpl.fetchClassById((com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLASS:
          serviceImpl.createClass((com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLASS:
          serviceImpl.updateClass((com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLASS_BY_ID:
          serviceImpl.deleteClassById((com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse>) responseObserver);
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

  private static final class SchoolClassServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.schoolclass.SchoolClassServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SchoolClassServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SchoolClassServiceDescriptorSupplier())
              .addMethod(METHOD_FETCH_CLASS_BY_ID)
              .addMethod(METHOD_CREATE_CLASS)
              .addMethod(METHOD_UPDATE_CLASS)
              .addMethod(METHOD_DELETE_CLASS_BY_ID)
              .build();
        }
      }
    }
    return result;
  }
}
