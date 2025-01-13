package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.KeepingUserActivityLogs;

import java.util.List;

public interface KeepingUserActivityLogsService {
    KeepingUserActivityLogs add(KeepingUserActivityLogs keepingUserActivityLogs);
    List<KeepingUserActivityLogs> getAll();
    KeepingUserActivityLogs getById(int id);
}
