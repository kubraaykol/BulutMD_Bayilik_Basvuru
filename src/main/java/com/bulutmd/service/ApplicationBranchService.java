package com.bulutmd.service;

import com.bulutmd.model.ApplicationBranchDTO;

import java.util.List;

public interface ApplicationBranchService {

    List<ApplicationBranchDTO> getAllApplicationBranch();
    ApplicationBranchDTO getApplicationBranchById(Long applicationBranchId);
    void updateApplicationBranch(ApplicationBranchDTO applicationBranchDTO);
    void deleteApplicationBranchById(Long applicationBranchId);
    ApplicationBranchDTO createApplicationBranch(ApplicationBranchDTO applicationBranchDTO);

}