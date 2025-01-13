package com.turkcell.pair4project.controller;

import com.turkcell.pair4project.entity.KeepingUserActivityLog;
import com.turkcell.pair4project.entity.Product;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.turkcell.pair4project.service.KeepingUserActivityLogsService;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/keepinguseractivitylogs")
public class KeepingUserActivityLogsController {

    private final KeepingUserActivityLogsService keepingUserActivityLogsService;

    // DI -> Dependency Injection Pattern
    public KeepingUserActivityLogsController(KeepingUserActivityLogsService keepingUserActivityLogsService) {
        this.keepingUserActivityLogsService = keepingUserActivityLogsService;
    }

    @GetMapping()
    public List<KeepingUserActivityLog> getAll() {
        return keepingUserActivityLogsService.getAll();
    }

    @GetMapping("{id}")
    public KeepingUserActivityLog getById(@PathVariable int id) {
        return keepingUserActivityLogsService.getById(id);
    }

    @PostMapping()
    public KeepingUserActivityLog add(@RequestBody @Valid KeepingUserActivityLog keepingUserActivityLog) {
        return keepingUserActivityLogsService.add(keepingUserActivityLog);
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
