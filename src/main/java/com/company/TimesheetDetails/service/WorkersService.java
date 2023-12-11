package com.company.TimesheetDetails.service;

import com.company.TimesheetDetails.entity.Workers;

import java.util.List;

public interface WorkersService {

    List<Workers> getAllWorkers();

    Workers saveWorkers(Workers workers);

    Workers getWorkersById(Long id);

    Workers updateWorkers(Workers workers);

    void deleteWorkersById(Long id);

}
