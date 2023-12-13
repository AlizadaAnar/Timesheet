package com.company.TimesheetDetails.controller;

import com.company.TimesheetDetails.entity.Workers;
import com.company.TimesheetDetails.service.WorkersService;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class WorkersController {

    private final WorkersService workersService;

    public WorkersController(WorkersService workersService) {
        super();
        this.workersService = workersService;
    }

    @CrossOrigin(origins = "http://localhost:5174")
    @GetMapping(value = "/workers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Workers> listWorkers() {
        return workersService.getAllWorkers();
    }


//    @CrossOrigin(origins = "http://localhost:5174")
//    @PostMapping("/workers")
//    public void saveWorkers(@ModelAttribute("workers") Workers workers) {
//        workersService.saveWorkers(workers);
//    }

    @CrossOrigin(origins = "http://localhost:5174")
    @PutMapping("/{id}")
    public Workers updateWorker(@PathVariable Long id, @RequestBody Workers workerRequest) {
        return workersService.updateWorkers(id, workerRequest);
    }

    @CrossOrigin(origins = "http://localhost:5174")
    @GetMapping("/workers/{workerId}/edit")
    public void editWorkerForm(@PathVariable("workerId") long workerId, Model model) {
        Workers worker = workersService.getWorkersById(workerId);
        model.addAttribute("worker", worker);
    }


    @GetMapping("/workers/new")
    public void createWorker(Model model) {
        Workers workers = new Workers();
//        model.addAttribute("worker", workers);
        workersService.saveWorkers(workers);
    }


    @GetMapping("/worker/{id}")
    public Workers findWorkerById(@PathVariable long id) {
        return workersService.getWorkersById(id);
    }


    @CrossOrigin(origins = "http://localhost:5174")
    @DeleteMapping("/workers/{id}")
    public void DELETE(@PathVariable Long id) {
        workersService.deleteWorkersById(id);
    }




}
