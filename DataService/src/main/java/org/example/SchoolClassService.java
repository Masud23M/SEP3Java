package org.example;

import com.example.grpc.schoolclass.SchoolClassServiceGrpc;
import com.example.grpc.schoolclass.SchoolClassServiceOuterClass;
import com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClass;
import com.example.grpc.schoolclass.SchoolClassServiceOuterClass.SchoolClassResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class SchoolClassService extends SchoolClassServiceGrpc.SchoolClassServiceImplBase
{
  @Override
  public void createClass(SchoolClass schoolClass, StreamObserver<SchoolClassResponse> responseObserver)
  {
    if (schoolClass.getName().isEmpty())
    {
      responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Name cannot be empty").asRuntimeException());
      return;
    }

    SchoolClassResponse response = SchoolClassResponse.newBuilder().build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void fetchClassById(SchoolClassServiceOuterClass.SchoolClassIdRequest request,
      io.grpc.stub.StreamObserver<SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void updateClass(SchoolClassServiceOuterClass.SchoolClass request,
      io.grpc.stub.StreamObserver<SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteClassById(SchoolClassServiceOuterClass.SchoolClassIdRequest request,
      io.grpc.stub.StreamObserver<SchoolClassServiceOuterClass.SchoolClassResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }


}
