package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.KeepingUserActivityLog;
import com.turkcell.pair4project.repository.KeepingUserActivityLogsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeepingUserActivityLogsServiceImpl implements KeepingUserActivityLogsService {
    private final KeepingUserActivityLogsRepository keepingUserActivityLogsRepository;

    public KeepingUserActivityLogsServiceImpl(KeepingUserActivityLogsRepository keepingUserActivityLogsRepository) {
        this.keepingUserActivityLogsRepository = keepingUserActivityLogsRepository;
    }
    @Override
    public KeepingUserActivityLog add(KeepingUserActivityLog keepingUserActivityLog) {
        keepingUserActivityLogsRepository.save(keepingUserActivityLog);
        return keepingUserActivityLog;
    }

    @Override
    public List<KeepingUserActivityLog> getAll() {
        return keepingUserActivityLogsRepository.findAll();
    }

    @Override
    public KeepingUserActivityLog getById(int id) {
        return keepingUserActivityLogsRepository.findById(id).orElse(null);
    }
}
