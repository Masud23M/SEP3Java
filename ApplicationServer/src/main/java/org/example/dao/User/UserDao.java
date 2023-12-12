package org.example.dao.User;

public interface UserDao
{
  String createUser(String id,String name,String password);
  String deleteUser(String id);
  String updateUser(String id,String name,String password);
  String getUserById(String id);
  String getAllUsers();
  String filterUsersByUsername(String username);
}
