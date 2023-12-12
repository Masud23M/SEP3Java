package com.example.grpc.user;

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
 * <pre>
 * Define the UserService
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: UserService.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.user.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.user.UserServiceOuterClass.UserRequest,
      com.example.grpc.user.UserServiceOuterClass.User> METHOD_GET_USER_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.user.UserServiceOuterClass.UserRequest, com.example.grpc.user.UserServiceOuterClass.User>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.user.UserService", "GetUserById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.user.UserServiceOuterClass.UserRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.user.UserServiceOuterClass.User.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.user.UserServiceOuterClass.User,
      com.example.grpc.user.UserServiceOuterClass.User> METHOD_CREATE_USER =
      io.grpc.MethodDescriptor.<com.example.grpc.user.UserServiceOuterClass.User, com.example.grpc.user.UserServiceOuterClass.User>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.user.UserService", "CreateUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.user.UserServiceOuterClass.User.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.user.UserServiceOuterClass.User.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.user.UserServiceOuterClass.User,
      com.example.grpc.user.UserServiceOuterClass.User> METHOD_UPDATE_USER =
      io.grpc.MethodDescriptor.<com.example.grpc.user.UserServiceOuterClass.User, com.example.grpc.user.UserServiceOuterClass.User>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.user.UserService", "UpdateUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.user.UserServiceOuterClass.User.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.user.UserServiceOuterClass.User.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.user.UserServiceOuterClass.UserRequest,
      com.example.grpc.user.UserServiceOuterClass.User> METHOD_DELETE_USER =
      io.grpc.MethodDescriptor.<com.example.grpc.user.UserServiceOuterClass.UserRequest, com.example.grpc.user.UserServiceOuterClass.User>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.user.UserService", "DeleteUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.user.UserServiceOuterClass.UserRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.user.UserServiceOuterClass.User.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Define the UserService
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserById(com.example.grpc.user.UserServiceOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_BY_ID, responseObserver);
    }

    /**
     */
    public void createUser(com.example.grpc.user.UserServiceOuterClass.User request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_USER, responseObserver);
    }

    /**
     */
    public void updateUser(com.example.grpc.user.UserServiceOuterClass.User request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_USER, responseObserver);
    }

    /**
     */
    public void deleteUser(com.example.grpc.user.UserServiceOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_USER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_USER_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.user.UserServiceOuterClass.UserRequest,
                com.example.grpc.user.UserServiceOuterClass.User>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            METHOD_CREATE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.user.UserServiceOuterClass.User,
                com.example.grpc.user.UserServiceOuterClass.User>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            METHOD_UPDATE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.user.UserServiceOuterClass.User,
                com.example.grpc.user.UserServiceOuterClass.User>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            METHOD_DELETE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.user.UserServiceOuterClass.UserRequest,
                com.example.grpc.user.UserServiceOuterClass.User>(
                  this, METHODID_DELETE_USER)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the UserService
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserById(com.example.grpc.user.UserServiceOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(com.example.grpc.user.UserServiceOuterClass.User request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.example.grpc.user.UserServiceOuterClass.User request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.example.grpc.user.UserServiceOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_USER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the UserService
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.user.UserServiceOuterClass.User getUserById(com.example.grpc.user.UserServiceOuterClass.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.user.UserServiceOuterClass.User createUser(com.example.grpc.user.UserServiceOuterClass.User request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_USER, getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.user.UserServiceOuterClass.User updateUser(com.example.grpc.user.UserServiceOuterClass.User request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_USER, getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.user.UserServiceOuterClass.User deleteUser(com.example.grpc.user.UserServiceOuterClass.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_USER, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the UserService
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.user.UserServiceOuterClass.User> getUserById(
        com.example.grpc.user.UserServiceOuterClass.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.user.UserServiceOuterClass.User> createUser(
        com.example.grpc.user.UserServiceOuterClass.User request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.user.UserServiceOuterClass.User> updateUser(
        com.example.grpc.user.UserServiceOuterClass.User request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.user.UserServiceOuterClass.User> deleteUser(
        com.example.grpc.user.UserServiceOuterClass.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_USER, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_BY_ID = 0;
  private static final int METHODID_CREATE_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_DELETE_USER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((com.example.grpc.user.UserServiceOuterClass.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.example.grpc.user.UserServiceOuterClass.User) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.example.grpc.user.UserServiceOuterClass.User) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.example.grpc.user.UserServiceOuterClass.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.user.UserServiceOuterClass.User>) responseObserver);
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

  private static final class UserServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.user.UserServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceDescriptorSupplier())
              .addMethod(METHOD_GET_USER_BY_ID)
              .addMethod(METHOD_CREATE_USER)
              .addMethod(METHOD_UPDATE_USER)
              .addMethod(METHOD_DELETE_USER)
              .build();
        }
      }
    }
    return result;
  }
}
