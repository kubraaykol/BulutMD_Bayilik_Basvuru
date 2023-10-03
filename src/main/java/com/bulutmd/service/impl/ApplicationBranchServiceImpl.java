package com.bulutmd.service.impl;

import com.bulutmd.entity.BranchApplicationEntity;
import com.bulutmd.mapper.BranchApplicationMapper;
import com.bulutmd.model.ApplicationBranchDTO;
import com.bulutmd.repository.BranchApplicationRepository;
import com.bulutmd.service.ApplicationBranchService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class ApplicationBranchServiceImpl implements ApplicationBranchService {


    private final BranchApplicationRepository branchApplicationRepository;

    private final BranchApplicationMapper branchApplicationMapper;

    @Override
    public List<ApplicationBranchDTO> getAllApplicationBranch() {
        List<BranchApplicationEntity> branchApplicationEntityList = branchApplicationRepository.findAll();

        return branchApplicationMapper.convertToDTOList(branchApplicationEntityList);
    }

    @Override
    public ApplicationBranchDTO getApplicationBranchById(Long applicationBranchId) {
        BranchApplicationEntity branchApplicationEntity = branchApplicationRepository.findById(applicationBranchId).get();

        return branchApplicationMapper.convertToDTO(branchApplicationEntity);
    }

    @Override
    public void updateApplicationBranch(ApplicationBranchDTO applicationBranchDTO) {
        BranchApplicationEntity branchApplicationEntity = branchApplicationMapper.convertToEntity(applicationBranchDTO);
        branchApplicationRepository.save(branchApplicationEntity);
    }

    @Override
    public void deleteApplicationBranchById(Long applicationBranchId) {
         branchApplicationRepository.deleteById(applicationBranchId);
    }

    @Override
    public ApplicationBranchDTO createApplicationBranch(ApplicationBranchDTO applicationBranchDTO) {
        BranchApplicationEntity branchApplicationEntity = branchApplicationMapper.convertToEntity(applicationBranchDTO);
        branchApplicationEntity.setBranchApplicationId(null);

        branchApplicationEntity =branchApplicationRepository.save(branchApplicationEntity);
        return branchApplicationMapper.convertToDTO(branchApplicationEntity);

    }
}
