package org.example;

import GrpcService.Greet;
import GrpcService.GreeterGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Main
{
  public static void main(String[] args)
  {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5277).usePlaintext().build();

    GreeterGrpc.GreeterBlockingStub userStub = GreeterGrpc.newBlockingStub(channel);
    Greet.HelloRequest request = Greet.HelloRequest.newBuilder().setName("test").build();
    Greet.HelloReply response = userStub.sayHello(request);
    System.out.println(response.getMessage());
  }
}