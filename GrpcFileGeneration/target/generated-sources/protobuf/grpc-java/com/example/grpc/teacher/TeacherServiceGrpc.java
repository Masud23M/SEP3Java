package com.example.grpc.teacher;

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
    comments = "Source: TeacherService.proto")
public final class TeacherServiceGrpc {

  private TeacherServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.teacher.TeacherService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest,
      com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> METHOD_FETCH_TEACHER_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest, com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.teacher.TeacherService", "FetchTeacherById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.teacher.TeacherServiceOuterClass.Teacher,
      com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> METHOD_CREATE_TEACHER =
      io.grpc.MethodDescriptor.<com.example.grpc.teacher.TeacherServiceOuterClass.Teacher, com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.teacher.TeacherService", "CreateTeacher"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.teacher.TeacherServiceOuterClass.Teacher.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.teacher.TeacherServiceOuterClass.Teacher,
      com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> METHOD_UPDATE_TEACHER =
      io.grpc.MethodDescriptor.<com.example.grpc.teacher.TeacherServiceOuterClass.Teacher, com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.teacher.TeacherService", "UpdateTeacher"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.teacher.TeacherServiceOuterClass.Teacher.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest,
      com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> METHOD_DELETE_TEACHER_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest, com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.teacher.TeacherService", "DeleteTeacherById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeacherServiceStub newStub(io.grpc.Channel channel) {
    return new TeacherServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeacherServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TeacherServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeacherServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TeacherServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TeacherServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Fetch a teacher by ID
     * </pre>
     */
    public void fetchTeacherById(com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_TEACHER_BY_ID, responseObserver);
    }

    /**
     * <pre>
     * Create a new teacher
     * </pre>
     */
    public void createTeacher(com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request,
        io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TEACHER, responseObserver);
    }

    /**
     * <pre>
     * Update a teacher's data
     * </pre>
     */
    public void updateTeacher(com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request,
        io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_TEACHER, responseObserver);
    }

    /**
     * <pre>
     * Delete a teacher by ID
     * </pre>
     */
    public void deleteTeacherById(com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_TEACHER_BY_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FETCH_TEACHER_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest,
                com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>(
                  this, METHODID_FETCH_TEACHER_BY_ID)))
          .addMethod(
            METHOD_CREATE_TEACHER,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.teacher.TeacherServiceOuterClass.Teacher,
                com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>(
                  this, METHODID_CREATE_TEACHER)))
          .addMethod(
            METHOD_UPDATE_TEACHER,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.teacher.TeacherServiceOuterClass.Teacher,
                com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>(
                  this, METHODID_UPDATE_TEACHER)))
          .addMethod(
            METHOD_DELETE_TEACHER_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest,
                com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>(
                  this, METHODID_DELETE_TEACHER_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class TeacherServiceStub extends io.grpc.stub.AbstractStub<TeacherServiceStub> {
    private TeacherServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a teacher by ID
     * </pre>
     */
    public void fetchTeacherById(com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FETCH_TEACHER_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new teacher
     * </pre>
     */
    public void createTeacher(com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request,
        io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TEACHER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a teacher's data
     * </pre>
     */
    public void updateTeacher(com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request,
        io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a teacher by ID
     * </pre>
     */
    public void deleteTeacherById(com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_TEACHER_BY_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TeacherServiceBlockingStub extends io.grpc.stub.AbstractStub<TeacherServiceBlockingStub> {
    private TeacherServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a teacher by ID
     * </pre>
     */
    public com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse fetchTeacherById(com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FETCH_TEACHER_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new teacher
     * </pre>
     */
    public com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse createTeacher(com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TEACHER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a teacher's data
     * </pre>
     */
    public com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse updateTeacher(com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_TEACHER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a teacher by ID
     * </pre>
     */
    public com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse deleteTeacherById(com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_TEACHER_BY_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeacherServiceFutureStub extends io.grpc.stub.AbstractStub<TeacherServiceFutureStub> {
    private TeacherServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a teacher by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> fetchTeacherById(
        com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FETCH_TEACHER_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new teacher
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> createTeacher(
        com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TEACHER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a teacher's data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> updateTeacher(
        com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TEACHER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a teacher by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> deleteTeacherById(
        com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_TEACHER_BY_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_TEACHER_BY_ID = 0;
  private static final int METHODID_CREATE_TEACHER = 1;
  private static final int METHODID_UPDATE_TEACHER = 2;
  private static final int METHODID_DELETE_TEACHER_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TeacherServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TeacherServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_TEACHER_BY_ID:
          serviceImpl.fetchTeacherById((com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>) responseObserver);
          break;
        case METHODID_CREATE_TEACHER:
          serviceImpl.createTeacher((com.example.grpc.teacher.TeacherServiceOuterClass.Teacher) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TEACHER:
          serviceImpl.updateTeacher((com.example.grpc.teacher.TeacherServiceOuterClass.Teacher) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>) responseObserver);
          break;
        case METHODID_DELETE_TEACHER_BY_ID:
          serviceImpl.deleteTeacherById((com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse>) responseObserver);
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

  private static final class TeacherServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.teacher.TeacherServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TeacherServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeacherServiceDescriptorSupplier())
              .addMethod(METHOD_FETCH_TEACHER_BY_ID)
              .addMethod(METHOD_CREATE_TEACHER)
              .addMethod(METHOD_UPDATE_TEACHER)
              .addMethod(METHOD_DELETE_TEACHER_BY_ID)
              .build();
        }
      }
    }
    return result;
  }
}
