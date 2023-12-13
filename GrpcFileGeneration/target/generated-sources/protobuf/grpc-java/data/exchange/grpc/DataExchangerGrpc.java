package data.exchange.grpc;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: DataExchange.proto")
public final class DataExchangerGrpc {

  private DataExchangerGrpc() {}

  public static final String SERVICE_NAME = "dataexchange.DataExchanger";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<data.exchange.grpc.DataExchange.DataRequest,
      data.exchange.grpc.DataExchange.DataResponse> METHOD_SEND_DATA =
      io.grpc.MethodDescriptor.<data.exchange.grpc.DataExchange.DataRequest, data.exchange.grpc.DataExchange.DataResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dataexchange.DataExchanger", "SendData"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data.exchange.grpc.DataExchange.DataRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              data.exchange.grpc.DataExchange.DataResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataExchangerStub newStub(io.grpc.Channel channel) {
    return new DataExchangerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataExchangerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataExchangerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataExchangerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataExchangerFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class DataExchangerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sendData(data.exchange.grpc.DataExchange.DataRequest request,
        io.grpc.stub.StreamObserver<data.exchange.grpc.DataExchange.DataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_DATA, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND_DATA,
            asyncUnaryCall(
              new MethodHandlers<
                data.exchange.grpc.DataExchange.DataRequest,
                data.exchange.grpc.DataExchange.DataResponse>(
                  this, METHODID_SEND_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class DataExchangerStub extends io.grpc.stub.AbstractStub<DataExchangerStub> {
    private DataExchangerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataExchangerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataExchangerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataExchangerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sendData(data.exchange.grpc.DataExchange.DataRequest request,
        io.grpc.stub.StreamObserver<data.exchange.grpc.DataExchange.DataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_DATA, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class DataExchangerBlockingStub extends io.grpc.stub.AbstractStub<DataExchangerBlockingStub> {
    private DataExchangerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataExchangerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataExchangerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataExchangerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public data.exchange.grpc.DataExchange.DataResponse sendData(data.exchange.grpc.DataExchange.DataRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_DATA, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class DataExchangerFutureStub extends io.grpc.stub.AbstractStub<DataExchangerFutureStub> {
    private DataExchangerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataExchangerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataExchangerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataExchangerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<data.exchange.grpc.DataExchange.DataResponse> sendData(
        data.exchange.grpc.DataExchange.DataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_DATA, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataExchangerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataExchangerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_DATA:
          serviceImpl.sendData((data.exchange.grpc.DataExchange.DataRequest) request,
              (io.grpc.stub.StreamObserver<data.exchange.grpc.DataExchange.DataResponse>) responseObserver);
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

  private static final class DataExchangerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return data.exchange.grpc.DataExchange.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataExchangerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataExchangerDescriptorSupplier())
              .addMethod(METHOD_SEND_DATA)
              .build();
        }
      }
    }
    return result;
  }
}
