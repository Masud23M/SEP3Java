package org.example;

import com.example.grpc.exam.ExamServiceOuterClass;
import com.example.grpc.exam.ExamServiceGrpc;
import com.example.grpc.exam.ExamServiceGrpc.ExamServiceBlockingStub;
import io.grpc.Channel;

public class ExamGrpcDataSource
{
  private final ExamServiceBlockingStub stub;

  public ExamGrpcDataSource(Channel channel) {
    this.stub = ExamServiceGrpc.newBlockingStub(channel);
  }

  private void testMethod() {
    ExamServiceOuterClass.Exam exam = ExamServiceOuterClass.Exam.newBuilder()
        .setIdOfExam(1)
        .setNameOfExam("SDJ")
        .setDt("2021-05-05")
        .setSchoolClass("SDJ")
        .build();
    stub.createExam(exam);
  }

  private void testMethod2() {
    ExamServiceOuterClass.ExamIdRequest examIdRequest = ExamServiceOuterClass.ExamIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.deleteExamById(examIdRequest);
  }

  private void testMethod3() {
    ExamServiceOuterClass.Exam exam = ExamServiceOuterClass.Exam.newBuilder()
        .setIdOfExam(1)
        .setNameOfExam("SDJ")
        .setDt("2021-05-05")
        .setSchoolClass("SDJ")
        .build();
    stub.updateExam(exam);
  }

  private void testMethod4() {
    ExamServiceOuterClass.ExamIdRequest examIdRequest = ExamServiceOuterClass.ExamIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.fetchExamById(examIdRequest);
  }


}
