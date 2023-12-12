package org.example;

import com.example.grpc.grade.GradeServiceGrpc;
import com.example.grpc.grade.GradeServiceOuterClass;
import com.example.grpc.grade.GradeServiceGrpc.GradeServiceBlockingStub;
import com.example.grpc.schoolclass.SchoolClassServiceOuterClass;
import io.grpc.Channel;

public class GradeGrpcDataSource
{
  private final GradeServiceBlockingStub stub;

  public GradeGrpcDataSource(Channel channel)
  {
    this.stub = GradeServiceGrpc.newBlockingStub(channel);
  }

  private void testMethod()
  {
    GradeServiceOuterClass.Grade grade = GradeServiceOuterClass.Grade.newBuilder()
        .setId(1)
        .setExamId("1")
        .setStudentId("1")
        .setStudentGrade(12)
        .build();
    stub.createGrade(grade);
  }

  private void testMethod2()
  {
    GradeServiceOuterClass.GradeIdRequest gradeIdRequest= GradeServiceOuterClass.GradeIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.fetchGradeByStudentId(gradeIdRequest);
  }
}
