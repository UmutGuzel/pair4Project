package com.turkcell.pair4project.controller;

import com.turkcell.pair4project.entity.EmployeeActivityLog;
import com.turkcell.pair4project.entity.Product;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.turkcell.pair4project.service.EmployeeActivityLogService;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/employeeactivitylog")
public class EmployeeActivityLogController {

    private final EmployeeActivityLogService employeeActivityLogService;

    public EmployeeActivityLogController(EmployeeActivityLogService employeeActivityLogService) {
        this.employeeActivityLogService = employeeActivityLogService;
    }

    @GetMapping("/all")
    public List<EmployeeActivityLog> getAll() {
        return employeeActivityLogService.getAll();
    }

    @GetMapping("{id}")
    public EmployeeActivityLog getById(@PathVariable int id) {
        return employeeActivityLogService.getById(id);
    }

    @PostMapping()
    public EmployeeActivityLog add(@RequestBody @Valid EmployeeActivityLog employeeActivityLog) {
        return employeeActivityLogService.add(employeeActivityLog);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        employeeActivityLogService.delete(id);
    }

    @PutMapping()
    public EmployeeActivityLog update(@RequestBody EmployeeActivityLog employeeActivityLog) {
        return employeeActivityLogService.update(employeeActivityLog.getId(), employeeActivityLog);
    }
}
