package org.example;

import com.example.grpc.teacher.TeacherServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends TeacherServiceGrpc.TeacherServiceImplBase
{
  @Override
  public void createTeacher(com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request,
      io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void fetchTeacherById(com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request,
      io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void updateTeacher(com.example.grpc.teacher.TeacherServiceOuterClass.Teacher request,
      io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteTeacherById(com.example.grpc.teacher.TeacherServiceOuterClass.TeacherIdRequest request,
      io.grpc.stub.StreamObserver<com.example.grpc.teacher.TeacherServiceOuterClass.TeacherResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }
}
