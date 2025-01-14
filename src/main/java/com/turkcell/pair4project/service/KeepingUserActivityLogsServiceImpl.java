package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.KeepingUserActivityLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeepingUserActivityLogsServiceImpl implements KeepingUserActivityLogsService {
    @Override
    public KeepingUserActivityLog add(KeepingUserActivityLog keepingUserActivityLog) {
        return null;
    }

    @Override
    public List<KeepingUserActivityLog> getAll() {
        return List.of();
    }

    @Override
    public KeepingUserActivityLog getById(int id) {
        return null;
    }
}
