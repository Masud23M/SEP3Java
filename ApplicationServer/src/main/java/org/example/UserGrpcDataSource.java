package org.example;

import com.example.grpc.user.UserServiceOuterClass;
import com.example.grpc.user.UserServiceGrpc;
import com.example.grpc.user.UserServiceGrpc.UserServiceBlockingStub;
import io.grpc.Channel;

public class UserGrpcDataSource
{

    private final UserServiceBlockingStub stub;

    public UserGrpcDataSource(Channel channel)
    {
      this.stub = UserServiceGrpc.newBlockingStub(channel);
    }

    private void testMethod()
    {
      UserServiceOuterClass.User user = UserServiceOuterClass.User.newBuilder()
          .setId("1")
          .setPassword("10293847")
          .build();
      stub.createUser(user);
    }

    private void testMethod2()
    {
      UserServiceOuterClass.User user = UserServiceOuterClass.User.newBuilder()
          .setId("1")
          .setPassword("56473829")
          .build();
      stub.updateUser(user);
    }

}
