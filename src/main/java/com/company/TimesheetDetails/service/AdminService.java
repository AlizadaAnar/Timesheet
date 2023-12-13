package com.company.TimesheetDetails.service;

import com.company.TimesheetDetails.entity.Admin;
import com.company.TimesheetDetails.entity.Workers;

import java.util.List;

public interface AdminService {

    List<Admin> getAdmin();

    Admin saveAdmin(Admin admin);

    Admin getAdminById(Long id);

    Admin updateAdmin(Admin admin);

    void deleteAdminById(Long id);

    Admin getAdminByUsername(String username);

}
