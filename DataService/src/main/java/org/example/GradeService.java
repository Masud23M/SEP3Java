package org.example;

import com.example.grpc.grade.GradeServiceGrpc;
import com.example.grpc.grade.GradeServiceOuterClass;
import com.example.grpc.grade.GradeServiceOuterClass.Grade;
import com.example.grpc.grade.GradeServiceOuterClass.GradeResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class GradeService extends GradeServiceGrpc.GradeServiceImplBase
{

  @Override
  public void createGrade(Grade grade, StreamObserver<GradeServiceOuterClass.GradeResponse> responseObserver)
  {
    if (grade.getStudentId().isEmpty())
    {
      responseObserver.onError(
          Status.INVALID_ARGUMENT.withDescription("Id cannot be empty").asRuntimeException());
      return;
    }

    GradeResponse response = GradeResponse.newBuilder().build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void fetchGradeByStudentId(GradeServiceOuterClass.GradeIdRequest request,
      io.grpc.stub.StreamObserver<GradeServiceOuterClass.GradeResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }
}
