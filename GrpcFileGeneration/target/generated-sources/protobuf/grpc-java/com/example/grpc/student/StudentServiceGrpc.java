package com.example.grpc.student;

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
    comments = "Source: StudentService.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.student.StudentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest,
      com.example.grpc.student.StudentServiceOuterClass.StudentResponse> METHOD_FETCH_STUDENT_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest, com.example.grpc.student.StudentServiceOuterClass.StudentResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.student.StudentService", "FetchStudentById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.student.StudentServiceOuterClass.StudentResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.student.StudentServiceOuterClass.Student,
      com.example.grpc.student.StudentServiceOuterClass.StudentResponse> METHOD_CREATE_STUDENT =
      io.grpc.MethodDescriptor.<com.example.grpc.student.StudentServiceOuterClass.Student, com.example.grpc.student.StudentServiceOuterClass.StudentResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.student.StudentService", "CreateStudent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.student.StudentServiceOuterClass.Student.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.student.StudentServiceOuterClass.StudentResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.student.StudentServiceOuterClass.Student,
      com.example.grpc.student.StudentServiceOuterClass.StudentResponse> METHOD_UPDATE_STUDENT =
      io.grpc.MethodDescriptor.<com.example.grpc.student.StudentServiceOuterClass.Student, com.example.grpc.student.StudentServiceOuterClass.StudentResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.student.StudentService", "UpdateStudent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.student.StudentServiceOuterClass.Student.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.student.StudentServiceOuterClass.StudentResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest,
      com.example.grpc.student.StudentServiceOuterClass.StudentResponse> METHOD_DELETE_STUDENT_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest, com.example.grpc.student.StudentServiceOuterClass.StudentResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.student.StudentService", "DeleteStudentById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.student.StudentServiceOuterClass.StudentResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Fetch a student by ID
     * </pre>
     */
    public void fetchStudentById(com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_STUDENT_BY_ID, responseObserver);
    }

    /**
     * <pre>
     * Create a new student
     * </pre>
     */
    public void createStudent(com.example.grpc.student.StudentServiceOuterClass.Student request,
        io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_STUDENT, responseObserver);
    }

    /**
     * <pre>
     * Update a student's data
     * </pre>
     */
    public void updateStudent(com.example.grpc.student.StudentServiceOuterClass.Student request,
        io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STUDENT, responseObserver);
    }

    /**
     * <pre>
     * Delete a student by ID
     * </pre>
     */
    public void deleteStudentById(com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_STUDENT_BY_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FETCH_STUDENT_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest,
                com.example.grpc.student.StudentServiceOuterClass.StudentResponse>(
                  this, METHODID_FETCH_STUDENT_BY_ID)))
          .addMethod(
            METHOD_CREATE_STUDENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.student.StudentServiceOuterClass.Student,
                com.example.grpc.student.StudentServiceOuterClass.StudentResponse>(
                  this, METHODID_CREATE_STUDENT)))
          .addMethod(
            METHOD_UPDATE_STUDENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.student.StudentServiceOuterClass.Student,
                com.example.grpc.student.StudentServiceOuterClass.StudentResponse>(
                  this, METHODID_UPDATE_STUDENT)))
          .addMethod(
            METHOD_DELETE_STUDENT_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest,
                com.example.grpc.student.StudentServiceOuterClass.StudentResponse>(
                  this, METHODID_DELETE_STUDENT_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a student by ID
     * </pre>
     */
    public void fetchStudentById(com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FETCH_STUDENT_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new student
     * </pre>
     */
    public void createStudent(com.example.grpc.student.StudentServiceOuterClass.Student request,
        io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_STUDENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a student's data
     * </pre>
     */
    public void updateStudent(com.example.grpc.student.StudentServiceOuterClass.Student request,
        io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a student by ID
     * </pre>
     */
    public void deleteStudentById(com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_STUDENT_BY_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a student by ID
     * </pre>
     */
    public com.example.grpc.student.StudentServiceOuterClass.StudentResponse fetchStudentById(com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FETCH_STUDENT_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new student
     * </pre>
     */
    public com.example.grpc.student.StudentServiceOuterClass.StudentResponse createStudent(com.example.grpc.student.StudentServiceOuterClass.Student request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_STUDENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a student's data
     * </pre>
     */
    public com.example.grpc.student.StudentServiceOuterClass.StudentResponse updateStudent(com.example.grpc.student.StudentServiceOuterClass.Student request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STUDENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a student by ID
     * </pre>
     */
    public com.example.grpc.student.StudentServiceOuterClass.StudentResponse deleteStudentById(com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_STUDENT_BY_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch a student by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> fetchStudentById(
        com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FETCH_STUDENT_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new student
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> createStudent(
        com.example.grpc.student.StudentServiceOuterClass.Student request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_STUDENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a student's data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> updateStudent(
        com.example.grpc.student.StudentServiceOuterClass.Student request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STUDENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a student by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> deleteStudentById(
        com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_STUDENT_BY_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_STUDENT_BY_ID = 0;
  private static final int METHODID_CREATE_STUDENT = 1;
  private static final int METHODID_UPDATE_STUDENT = 2;
  private static final int METHODID_DELETE_STUDENT_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_STUDENT_BY_ID:
          serviceImpl.fetchStudentById((com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse>) responseObserver);
          break;
        case METHODID_CREATE_STUDENT:
          serviceImpl.createStudent((com.example.grpc.student.StudentServiceOuterClass.Student) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT:
          serviceImpl.updateStudent((com.example.grpc.student.StudentServiceOuterClass.Student) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse>) responseObserver);
          break;
        case METHODID_DELETE_STUDENT_BY_ID:
          serviceImpl.deleteStudentById((com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse>) responseObserver);
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

  private static final class StudentServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.student.StudentServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceDescriptorSupplier())
              .addMethod(METHOD_FETCH_STUDENT_BY_ID)
              .addMethod(METHOD_CREATE_STUDENT)
              .addMethod(METHOD_UPDATE_STUDENT)
              .addMethod(METHOD_DELETE_STUDENT_BY_ID)
              .build();
        }
      }
    }
    return result;
  }
}
