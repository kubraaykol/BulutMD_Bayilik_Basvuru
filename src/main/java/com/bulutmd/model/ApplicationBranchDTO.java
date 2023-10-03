package com.bulutmd.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;

import java.util.Date;

@Data
public class ApplicationBranchDTO {

    private Long branchApplicationId;
    private String name;
    private String surname;
    private String idNumber;
    private String address;
    private String phoneNumber;
    private String email;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date birthDay;
    private boolean hasRetailExperience;

    private String reasonOfPrefer;

    private String preferredCity;

    private String preferredDistrict;

    private String preferredTown;

    private double investmentAmount;

    private String notes;


}