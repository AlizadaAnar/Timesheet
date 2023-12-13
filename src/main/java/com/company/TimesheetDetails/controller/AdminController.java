package com.company.TimesheetDetails.controller;

import com.company.TimesheetDetails.entity.Admin;
import com.company.TimesheetDetails.service.AdminService;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping("/my/v2")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        super();
        this.adminService = adminService;
    }


    @GetMapping(value = "/admin", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Admin> listAdmin() {
        return adminService.getAdmin();
    }

    @PostMapping("/admin")
    public void saveAdmin(@ModelAttribute("workers") Admin admin) {
        adminService.saveAdmin(admin);
    }

    @GetMapping("/admin/{adminId}/edit")
    public void editAdminForm(@PathVariable("adminId") long adminId, Model model) {
        Admin admin = adminService.getAdminById(adminId);
        model.addAttribute("admin", admin);
    }

    @GetMapping("/admin/new")
    public void createAdmin(Model model) {
        Admin admin = new Admin();
//        model.addAttribute("admin", admin);
        adminService.saveAdmin(admin);
    }

    @GetMapping("/admin/{id}")
    public Admin findAdminById(@PathVariable long id) {
        return adminService.getAdminById(id);
    }

    @DeleteMapping("/admin/{id}")
    public void deleteAdmin(@PathVariable Long id) {
        adminService.deleteAdminById(id);
    }


    @GetMapping("/admin/{username}")
    public Admin getAdminByUsername(@PathVariable String username) {
        return adminService.getAdminByUsername(username);
    }

}
