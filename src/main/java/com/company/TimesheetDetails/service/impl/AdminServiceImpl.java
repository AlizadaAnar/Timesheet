package com.company.TimesheetDetails.service.impl;

import com.company.TimesheetDetails.entity.Admin;
import com.company.TimesheetDetails.entity.Workers;
import com.company.TimesheetDetails.repository.AdminRepository;
import com.company.TimesheetDetails.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        super();
        this.adminRepository = adminRepository;
    }

    @Override
    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).get();
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdminById(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}
