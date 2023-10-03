package com.bulutmd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "branch_application_tbl")
public class BranchApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchApplicationId;

    @Column(nullable = false, length = 35)
    private String name;

    @Column(nullable = false, length = 35)
    private String surname;

    @Column(nullable = false, length = 11, unique = true)
    private String idNumber;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false, length = 10, unique = true)
    private String phoneNumber;

    @Column(nullable = false, length = 35, unique = true)
    private String email;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthDay;

    @Column(nullable = false)
    private boolean hasRetailExperience;

    @Column(nullable = false, length = 25)
    private String reasonOfPrefer;

    @Column(nullable = false, length = 15)
    private String preferredCity;

    @Column(nullable = false, length = 15)
    private String preferredDistrict;

    @Column(nullable = false, length = 15)
    private String preferredTown;

    @Column(nullable = false)
    private double investmentAmount;

    @Column(nullable = true, length = 1000)
    private String notes;



}
