package com.company.TimesheetDetails.service;

import com.company.TimesheetDetails.entity.Admin;
import com.company.TimesheetDetails.entity.Workers;

import java.util.List;

public interface AdminService {

    List<Admin> getAdmin();

    Admin saveAdmin(Admin admin);

    Admin getAdminById(Long id);

    Admin updateAdmin(Long id, Admin admin);

    void deleteAdminById(Long id);

    public String getPasswordByUsername(String username);
}
