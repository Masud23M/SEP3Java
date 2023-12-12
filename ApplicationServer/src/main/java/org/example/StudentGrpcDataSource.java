package org.example;

import com.example.grpc.student.StudentServiceOuterClass;
import com.example.grpc.student.StudentServiceGrpc;
import com.example.grpc.student.StudentServiceGrpc.StudentServiceBlockingStub;
import io.grpc.Channel;
public class StudentGrpcDataSource
{
  private final StudentServiceBlockingStub stub;

  public StudentGrpcDataSource(Channel channel)
  {
    this.stub = StudentServiceGrpc.newBlockingStub(channel);
  }

  private void testMethod()
  {
    StudentServiceOuterClass.Student student = StudentServiceOuterClass.Student.newBuilder()
        .setId("1")
        .setUserId("2")
        .setName("John")
        .setPassword("12345678")
        .build();
    stub.createStudent(student);
  }

  private void testMethod2()
  {
    StudentServiceOuterClass.Student student = StudentServiceOuterClass.Student.newBuilder()
        .setId("1")
        .setUserId("2")
        .setName("John")
        .setPassword("12345678")
        .build();
    stub.updateStudent(student);
  }

  private void testMethod3()
  {
    StudentServiceOuterClass.StudentIdRequest studentIdRequest = StudentServiceOuterClass.StudentIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.deleteStudentById(studentIdRequest);
  }

  private void testMethod4()
  {
    StudentServiceOuterClass.StudentIdRequest studentIdRequest = StudentServiceOuterClass.StudentIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.fetchStudentById(studentIdRequest);
  }
}
