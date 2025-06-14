package com.example.vms_project.dtos.requests;

import lombok.Data;

@Data
public class VeterinaryRegistrationRequest {
    private String username;
    private String password;
    private String clinicName;
    private String address;
    private String phoneNumber;
    private String email;
    private String licenseNumber;
    private String certificateInfo;
    private String specialization;
    private String workingHours;
}
