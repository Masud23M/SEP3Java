package org.example;

import com.example.grpc.teacher.TeacherServiceOuterClass;
import com.example.grpc.teacher.TeacherServiceGrpc;
import com.example.grpc.teacher.TeacherServiceGrpc.TeacherServiceBlockingStub;
import io.grpc.Channel;
public class TeacherGrpcDataSource
{
  private final TeacherServiceBlockingStub stub;

  public TeacherGrpcDataSource(Channel channel)
  {
    this.stub = TeacherServiceGrpc.newBlockingStub(channel);
  }

  private void testMethod()
  {
    TeacherServiceOuterClass.Teacher teacher = TeacherServiceOuterClass.Teacher.newBuilder()
        .setId("1")
        .setUserId("2")
        .setName("Jakob")
        .setPassword("13579013")
        .build();
    stub.createTeacher(teacher);
  }

  private void testMethod2()
  {
    TeacherServiceOuterClass.Teacher teacher = TeacherServiceOuterClass.Teacher.newBuilder()
        .setId("1")
        .setUserId("2")
        .setName("John")
        .setPassword("12345678")
        .build();
    stub.updateTeacher(teacher);
  }

  private void testMethod3()
  {
    TeacherServiceOuterClass.TeacherIdRequest teacherIdRequest = TeacherServiceOuterClass.TeacherIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.deleteTeacherById(teacherIdRequest);
  }

  private void testMethod4()
  {
    TeacherServiceOuterClass.TeacherIdRequest teacherIdRequest = TeacherServiceOuterClass.TeacherIdRequest.newBuilder()
        .setId(1)
        .build();
    stub.fetchTeacherById(teacherIdRequest);
  }
}
