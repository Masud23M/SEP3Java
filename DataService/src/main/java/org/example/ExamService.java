package org.example;

import com.example.grpc.exam.ExamServiceGrpc;
import com.example.grpc.exam.ExamServiceOuterClass;
import com.example.grpc.exam.ExamServiceOuterClass.Exam;
import com.example.grpc.exam.ExamServiceOuterClass.ExamResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService extends ExamServiceGrpc.ExamServiceImplBase
{
  @Override
  public void createExam(Exam exam, StreamObserver<ExamResponse> responseObserver)
  {
    if (exam.getNameOfExam().isEmpty())
    {
      responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Name cannot be empty").asRuntimeException());
      return;
    }

    ExamResponse response = ExamResponse.newBuilder().build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void fetchExamById(ExamServiceOuterClass.ExamIdRequest request,
      io.grpc.stub.StreamObserver<ExamServiceOuterClass.ExamResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void updateExam(ExamServiceOuterClass.Exam request,
      io.grpc.stub.StreamObserver<ExamServiceOuterClass.ExamResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteExamById(ExamServiceOuterClass.ExamIdRequest request,
      io.grpc.stub.StreamObserver<ExamServiceOuterClass.ExamResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }


}
