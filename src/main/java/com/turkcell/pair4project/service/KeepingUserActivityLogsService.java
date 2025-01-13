package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.KeepingUserActivityLog;

import java.util.List;

public interface KeepingUserActivityLogsService {
    KeepingUserActivityLog add(KeepingUserActivityLog keepingUserActivityLog);
    List<KeepingUserActivityLog> getAll();
    KeepingUserActivityLog getById(int id);
}
