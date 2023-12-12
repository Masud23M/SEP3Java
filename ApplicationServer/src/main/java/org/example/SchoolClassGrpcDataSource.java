package org.example;

import com.example.grpc.schoolclass.SchoolClassServiceGrpc;
import com.example.grpc.schoolclass.SchoolClassServiceOuterClass;
import com.example.grpc.schoolclass.SchoolClassServiceGrpc.SchoolClassServiceBlockingStub;
import io.grpc.Channel;

import java.util.Collections;

public class SchoolClassGrpcDataSource
{
  private final SchoolClassServiceBlockingStub stub;

public SchoolClassGrpcDataSource(Channel channel)
  {
    this.stub = SchoolClassServiceGrpc.newBlockingStub(channel);
  }

  private void testMethod()
  {
    SchoolClassServiceOuterClass.SchoolClass schoolClass = SchoolClassServiceOuterClass.SchoolClass.newBuilder()
        .setName("SDJ")
        .setTeacherId("1")
        .addAllStudentIds(Collections.singleton("1"))
        .setId(1)
        .build();
    stub.createClass(schoolClass);
  }

  private void testMethod2()
  {
    SchoolClassServiceOuterClass.SchoolClass schoolClass = SchoolClassServiceOuterClass.SchoolClass.newBuilder()
        .setName("SDJ")
        .setTeacherId("1")
        .addAllStudentIds(Collections.singleton("1"))
        .setId(1)
        .build();
    stub.updateClass(schoolClass);
  }

  private void testMethod3()
  {
    SchoolClassServiceOuterClass.SchoolClassIdRequest schoolClassIdRequest = SchoolClassServiceOuterClass.SchoolClassIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.deleteClassById(schoolClassIdRequest);
  }

  private void testMethod4()
  {
    SchoolClassServiceOuterClass.SchoolClassIdRequest schoolClassIdRequest = SchoolClassServiceOuterClass.SchoolClassIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.fetchClassById(schoolClassIdRequest);
  }
}
