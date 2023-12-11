package com.company.TimesheetDetails.controller;

import com.company.TimesheetDetails.entity.Workers;
import com.company.TimesheetDetails.service.WorkersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class WorkersController {

    private final WorkersService workersService;

    public WorkersController(WorkersService workersService) {
        super();
        this.workersService = workersService;
    }

    @GetMapping("/workers")
    public List<Workers> listWorkers() {
        return workersService.getAllWorkers();
    }

}
