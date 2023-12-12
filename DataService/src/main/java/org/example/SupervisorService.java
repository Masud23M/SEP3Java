package org.example;

import com.example.grpc.supervisor.SupervisorServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class SupervisorService extends SupervisorServiceGrpc.SupervisorServiceImplBase
{
  @Override
  public void createSupervisor(com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request,
      io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void fetchSupervisorById(com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request,
      io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void updateSupervisor(com.example.grpc.supervisor.SupervisorServiceOuterClass.Supervisor request,
      io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteSupervisorById(com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorIdRequest request,
      io.grpc.stub.StreamObserver<com.example.grpc.supervisor.SupervisorServiceOuterClass.SupervisorResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }
}
