package org.example;

import com.example.grpc.supervisor.SupervisorServiceOuterClass;
import com.example.grpc.supervisor.SupervisorServiceGrpc;
import com.example.grpc.supervisor.SupervisorServiceGrpc.SupervisorServiceBlockingStub;
import io.grpc.Channel;
public class SupervisorGrpcDataSource
{
  private final SupervisorServiceBlockingStub stub;

  public SupervisorGrpcDataSource(Channel channel)
  {
    this.stub = SupervisorServiceGrpc.newBlockingStub(channel);
  }

  private void testMethod()
  {
    SupervisorServiceOuterClass.Supervisor supervisor = SupervisorServiceOuterClass.Supervisor.newBuilder()
        .setId("1")
        .setPassword("09876543")
        .build();
    stub.createSupervisor(supervisor);
  }

  private void testMethod2()
  {
    SupervisorServiceOuterClass.Supervisor supervisor = SupervisorServiceOuterClass.Supervisor.newBuilder()
        .setId("1")
        .setPassword("12345678")
        .build();
    stub.updateSupervisor(supervisor);
  }

  private void testMethod3()
  {
    SupervisorServiceOuterClass.SupervisorIdRequest supervisorIdRequest = SupervisorServiceOuterClass.SupervisorIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.deleteSupervisorById(supervisorIdRequest);
  }

  private void testMethod4()
  {
    SupervisorServiceOuterClass.SupervisorIdRequest supervisorIdRequest = SupervisorServiceOuterClass.SupervisorIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.fetchSupervisorById(supervisorIdRequest);
  }
}
