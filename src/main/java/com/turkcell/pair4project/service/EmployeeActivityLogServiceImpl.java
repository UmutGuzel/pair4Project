package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.EmployeeActivityLog;
import com.turkcell.pair4project.repository.EmployeeActivityLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeActivityLogServiceImpl implements EmployeeActivityLogService {
    private final EmployeeActivityLogRepository employeeActivityLogRepository;

    public EmployeeActivityLogServiceImpl(EmployeeActivityLogRepository employeeActivityLogRepository) {
        this.employeeActivityLogRepository = employeeActivityLogRepository;
    }
    @Override
    public EmployeeActivityLog add(EmployeeActivityLog employeeActivityLog) {
        employeeActivityLogRepository.save(employeeActivityLog);
        return employeeActivityLog;
    }

    @Override
    public List<EmployeeActivityLog> getAll() {
        return employeeActivityLogRepository.findAll();
    }

    @Override
    public EmployeeActivityLog getById(int id) {
        return employeeActivityLogRepository.findById(id).orElse(null);
    }
}
