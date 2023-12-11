package com.company.TimesheetDetails.service.impl;

import com.company.TimesheetDetails.entity.Workers;
import com.company.TimesheetDetails.repository.AllWorkerRepository;
import com.company.TimesheetDetails.service.WorkersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkersServiceImpl implements WorkersService {

    private final AllWorkerRepository allWorkerRepository;

    public WorkersServiceImpl(AllWorkerRepository allWorkerRepository) {
        super();
        this.allWorkerRepository = allWorkerRepository;
    }

    @Override
    public List<Workers> getAllWorkers() {
        return allWorkerRepository.findAll();
    }

}
