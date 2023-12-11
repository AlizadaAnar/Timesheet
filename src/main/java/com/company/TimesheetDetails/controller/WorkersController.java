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

    @GetMapping(value = "/workers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Workers> listWorkers() {
        return workersService.getAllWorkers();
    }


    @PostMapping("/workers")
    public void saveWorkers(@ModelAttribute("workers") Workers workers) {
        workersService.saveWorkers(workers);
    }

    @GetMapping("/workers/{workerId}/edit")
    public void editWorkerForm(@PathVariable("workerId") long workerId, Model model) {
        Workers worker = workersService.getWorkersById(workerId);
        model.addAttribute("worker", worker);
    }


    @GetMapping("/workers/new")
    public void createWorker(Model model) {
        Workers workers = new Workers();
        model.addAttribute("worker", workers);
    }


    @GetMapping("/worker/{id}")
    public Workers findWorkerById(@PathVariable long id) {
        return workersService.getWorkersById(id);
    }


    @DeleteMapping("/workers/{id}")
    public void deleteWorkers(@PathVariable Long id) {
        workersService.deleteWorkersById(id);
    }




    //create and update
//    @PostMapping("/workers/{id}")
//    public void updateWorkers(@PathVariable Long id, @ModelAttribute("worker") Workers workers,
//                              Model model) {
//        Workers existingWorker = workersService.getWorkersById(id);
//        existingWorker.setFirstName();
//    }

}
