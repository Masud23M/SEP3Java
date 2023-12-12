package com.example.grpc.exam;

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
    comments = "Source: ExamService.proto")
public final class ExamServiceGrpc {

  private ExamServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.exam.ExamService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest,
      com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> METHOD_FETCH_EXAM_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest, com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.exam.ExamService", "FetchExamById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.exam.ExamServiceOuterClass.ExamResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.exam.ExamServiceOuterClass.Exam,
      com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> METHOD_CREATE_EXAM =
      io.grpc.MethodDescriptor.<com.example.grpc.exam.ExamServiceOuterClass.Exam, com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.exam.ExamService", "CreateExam"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.exam.ExamServiceOuterClass.Exam.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.exam.ExamServiceOuterClass.ExamResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.exam.ExamServiceOuterClass.Exam,
      com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> METHOD_UPDATE_EXAM =
      io.grpc.MethodDescriptor.<com.example.grpc.exam.ExamServiceOuterClass.Exam, com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.exam.ExamService", "UpdateExam"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.exam.ExamServiceOuterClass.Exam.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.exam.ExamServiceOuterClass.ExamResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest,
      com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> METHOD_DELETE_EXAM_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest, com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.exam.ExamService", "DeleteExamById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.exam.ExamServiceOuterClass.ExamResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExamServiceStub newStub(io.grpc.Channel channel) {
    return new ExamServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExamServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExamServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ExamServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Fetch an exam by ID
     * </pre>
     */
    public void fetchExamById(com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_EXAM_BY_ID, responseObserver);
    }

    /**
     * <pre>
     * Create a new exam
     * </pre>
     */
    public void createExam(com.example.grpc.exam.ExamServiceOuterClass.Exam request,
        io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_EXAM, responseObserver);
    }

    /**
     * <pre>
     * Update an exam's data
     * </pre>
     */
    public void updateExam(com.example.grpc.exam.ExamServiceOuterClass.Exam request,
        io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_EXAM, responseObserver);
    }

    /**
     * <pre>
     * Delete an exam by ID
     * </pre>
     */
    public void deleteExamById(com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_EXAM_BY_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FETCH_EXAM_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest,
                com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>(
                  this, METHODID_FETCH_EXAM_BY_ID)))
          .addMethod(
            METHOD_CREATE_EXAM,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.exam.ExamServiceOuterClass.Exam,
                com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>(
                  this, METHODID_CREATE_EXAM)))
          .addMethod(
            METHOD_UPDATE_EXAM,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.exam.ExamServiceOuterClass.Exam,
                com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>(
                  this, METHODID_UPDATE_EXAM)))
          .addMethod(
            METHOD_DELETE_EXAM_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest,
                com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>(
                  this, METHODID_DELETE_EXAM_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ExamServiceStub extends io.grpc.stub.AbstractStub<ExamServiceStub> {
    private ExamServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExamServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExamServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExamServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch an exam by ID
     * </pre>
     */
    public void fetchExamById(com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FETCH_EXAM_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new exam
     * </pre>
     */
    public void createExam(com.example.grpc.exam.ExamServiceOuterClass.Exam request,
        io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_EXAM, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an exam's data
     * </pre>
     */
    public void updateExam(com.example.grpc.exam.ExamServiceOuterClass.Exam request,
        io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_EXAM, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an exam by ID
     * </pre>
     */
    public void deleteExamById(com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_EXAM_BY_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExamServiceBlockingStub extends io.grpc.stub.AbstractStub<ExamServiceBlockingStub> {
    private ExamServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExamServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExamServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExamServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch an exam by ID
     * </pre>
     */
    public com.example.grpc.exam.ExamServiceOuterClass.ExamResponse fetchExamById(com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FETCH_EXAM_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new exam
     * </pre>
     */
    public com.example.grpc.exam.ExamServiceOuterClass.ExamResponse createExam(com.example.grpc.exam.ExamServiceOuterClass.Exam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_EXAM, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an exam's data
     * </pre>
     */
    public com.example.grpc.exam.ExamServiceOuterClass.ExamResponse updateExam(com.example.grpc.exam.ExamServiceOuterClass.Exam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_EXAM, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an exam by ID
     * </pre>
     */
    public com.example.grpc.exam.ExamServiceOuterClass.ExamResponse deleteExamById(com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_EXAM_BY_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExamServiceFutureStub extends io.grpc.stub.AbstractStub<ExamServiceFutureStub> {
    private ExamServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExamServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExamServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExamServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch an exam by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> fetchExamById(
        com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FETCH_EXAM_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> createExam(
        com.example.grpc.exam.ExamServiceOuterClass.Exam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_EXAM, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an exam's data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> updateExam(
        com.example.grpc.exam.ExamServiceOuterClass.Exam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_EXAM, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an exam by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse> deleteExamById(
        com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_EXAM_BY_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_EXAM_BY_ID = 0;
  private static final int METHODID_CREATE_EXAM = 1;
  private static final int METHODID_UPDATE_EXAM = 2;
  private static final int METHODID_DELETE_EXAM_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_EXAM_BY_ID:
          serviceImpl.fetchExamById((com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>) responseObserver);
          break;
        case METHODID_CREATE_EXAM:
          serviceImpl.createExam((com.example.grpc.exam.ExamServiceOuterClass.Exam) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EXAM:
          serviceImpl.updateExam((com.example.grpc.exam.ExamServiceOuterClass.Exam) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>) responseObserver);
          break;
        case METHODID_DELETE_EXAM_BY_ID:
          serviceImpl.deleteExamById((com.example.grpc.exam.ExamServiceOuterClass.ExamIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.exam.ExamServiceOuterClass.ExamResponse>) responseObserver);
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

  private static final class ExamServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.exam.ExamServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExamServiceDescriptorSupplier())
              .addMethod(METHOD_FETCH_EXAM_BY_ID)
              .addMethod(METHOD_CREATE_EXAM)
              .addMethod(METHOD_UPDATE_EXAM)
              .addMethod(METHOD_DELETE_EXAM_BY_ID)
              .build();
        }
      }
    }
    return result;
  }
}
