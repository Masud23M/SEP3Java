package com.example.grpc.grade;

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
    comments = "Source: GradeService.proto")
public final class GradeServiceGrpc {

  private GradeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.grade.GradeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.grade.GradeServiceOuterClass.StudentIdRequest,
      com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse> METHOD_FETCH_GRADE_BY_STUDENT_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.grade.GradeServiceOuterClass.StudentIdRequest, com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.grade.GradeService", "FetchGradeByStudentId"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.grade.GradeServiceOuterClass.StudentIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.grade.GradeServiceOuterClass.Grade,
      com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse> METHOD_CREATE_GRADE =
      io.grpc.MethodDescriptor.<com.example.grpc.grade.GradeServiceOuterClass.Grade, com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.grade.GradeService", "CreateGrade"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.grade.GradeServiceOuterClass.Grade.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GradeServiceStub newStub(io.grpc.Channel channel) {
    return new GradeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GradeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GradeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GradeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GradeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GradeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Fetch a grade by Student ID
     * </pre>
     */
    public void fetchGradeByStudentId(com.example.grpc.grade.GradeServiceOuterClass.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_GRADE_BY_STUDENT_ID, responseObserver);
    }

    /**
     * <pre>
     * Create a new grade
     * </pre>
     */
    public void createGrade(com.example.grpc.grade.GradeServiceOuterClass.Grade request,
        io.grpc.stub.StreamObserver<com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_GRADE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FETCH_GRADE_BY_STUDENT_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.grade.GradeServiceOuterClass.StudentIdRequest,
                com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse>(
                  this, METHODID_FETCH_GRADE_BY_STUDENT_ID)))
          .addMethod(
            METHOD_CREATE_GRADE,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.grade.GradeServiceOuterClass.Grade,
                com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse>(
                  this, METHODID_CREATE_GRADE)))
          .build();
    }
  }

  /**
   */
  public static final class GradeServiceStub extends io.grpc.stub.AbstractStub<GradeServiceStub> {
    private GradeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GradeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GradeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a grade by Student ID
     * </pre>
     */
    public void fetchGradeByStudentId(com.example.grpc.grade.GradeServiceOuterClass.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FETCH_GRADE_BY_STUDENT_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new grade
     * </pre>
     */
    public void createGrade(com.example.grpc.grade.GradeServiceOuterClass.Grade request,
        io.grpc.stub.StreamObserver<com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_GRADE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GradeServiceBlockingStub extends io.grpc.stub.AbstractStub<GradeServiceBlockingStub> {
    private GradeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GradeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GradeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a grade by Student ID
     * </pre>
     */
    public com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse fetchGradeByStudentId(com.example.grpc.grade.GradeServiceOuterClass.StudentIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FETCH_GRADE_BY_STUDENT_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new grade
     * </pre>
     */
    public com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse createGrade(com.example.grpc.grade.GradeServiceOuterClass.Grade request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_GRADE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GradeServiceFutureStub extends io.grpc.stub.AbstractStub<GradeServiceFutureStub> {
    private GradeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GradeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GradeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a grade by Student ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse> fetchGradeByStudentId(
        com.example.grpc.grade.GradeServiceOuterClass.StudentIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FETCH_GRADE_BY_STUDENT_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new grade
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse> createGrade(
        com.example.grpc.grade.GradeServiceOuterClass.Grade request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_GRADE, getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_GRADE_BY_STUDENT_ID = 0;
  private static final int METHODID_CREATE_GRADE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GradeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GradeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_GRADE_BY_STUDENT_ID:
          serviceImpl.fetchGradeByStudentId((com.example.grpc.grade.GradeServiceOuterClass.StudentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse>) responseObserver);
          break;
        case METHODID_CREATE_GRADE:
          serviceImpl.createGrade((com.example.grpc.grade.GradeServiceOuterClass.Grade) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.grade.GradeServiceOuterClass.StudentIdResponse>) responseObserver);
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

  private static final class GradeServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.grade.GradeServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GradeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GradeServiceDescriptorSupplier())
              .addMethod(METHOD_FETCH_GRADE_BY_STUDENT_ID)
              .addMethod(METHOD_CREATE_GRADE)
              .build();
        }
      }
    }
    return result;
  }
}
