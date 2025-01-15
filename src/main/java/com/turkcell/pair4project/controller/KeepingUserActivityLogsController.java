package com.turkcell.pair4project.controller;

import com.turkcell.pair4project.entity.EmployeeActivityLog;
import com.turkcell.pair4project.entity.Product;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.turkcell.pair4project.service.EmployeeActivityLogService;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/keepinguseractivitylogs")
public class KeepingUserActivityLogsController {

    private final EmployeeActivityLogService employeeActivityLogService;

    // DI -> Dependency Injection Pattern
    public KeepingUserActivityLogsController(EmployeeActivityLogService employeeActivityLogService) {
        this.employeeActivityLogService = employeeActivityLogService;
    }

    @GetMapping()
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
    public String delete(@PathVariable int id) {
        return "Silindi ?? Bulunamadı";
    }

    @PutMapping()
    public Product update(@RequestBody Product product) {
        return product; // Güncelledikten sonra.
    }
}
