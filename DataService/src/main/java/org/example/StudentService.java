package org.example;

import com.example.grpc.student.StudentServiceGrpc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService extends StudentServiceGrpc.StudentServiceImplBase
{
  @Override
  public void createStudent(com.example.grpc.student.StudentServiceOuterClass.Student student,
      io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void fetchStudentById(com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request,
      io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void updateStudent(com.example.grpc.student.StudentServiceOuterClass.Student request,
      io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteStudentById(com.example.grpc.student.StudentServiceOuterClass.StudentIdRequest request,
      io.grpc.stub.StreamObserver<com.example.grpc.student.StudentServiceOuterClass.StudentResponse> responseObserver)
  {
    // TODO Auto-generated method stub

  }
}
