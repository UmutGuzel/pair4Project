package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.EmployeeActivityLog;

import java.util.List;

public interface EmployeeActivityLogService {
    EmployeeActivityLog add(EmployeeActivityLog employeeActivityLog);
    List<EmployeeActivityLog> getAll();
    EmployeeActivityLog getById(int id);
    void delete(int id);
    EmployeeActivityLog update(int id, EmployeeActivityLog employeeActivityLog);
}
