package org.example.dao.Supervisor;

import org.example.model.SupervisorModel;

import java.util.List;

public interface SupervisorDao
{
  String createSupervisor(String Id, String password);
  String deleteSupervisor(String Id, String password);
  String updateSupervisor(String Id, String password);

  SupervisorModel getSupervisorById(String Id);
  List<SupervisorModel> getAllSupervisors();
}
