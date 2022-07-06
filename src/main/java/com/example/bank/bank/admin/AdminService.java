package com.example.bank.bank.admin;

import org.springframework.beans.factory.annotation.Autowired;

public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService (AdminRepository adminRepository){
        this.adminRepository =adminRepository;
    }
}
