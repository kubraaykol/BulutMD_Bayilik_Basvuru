package com.bulutmd.mapper;

import com.bulutmd.entity.BranchApplicationEntity;
import com.bulutmd.model.ApplicationBranchDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BranchApplicationMapper {

    public ApplicationBranchDTO convertToDTO(BranchApplicationEntity entity) {
        ApplicationBranchDTO applicationBranchDTO = new ApplicationBranchDTO();
        applicationBranchDTO.setBranchApplicationId(entity.getBranchApplicationId());
        applicationBranchDTO.setName(entity.getName());
        applicationBranchDTO.setSurname(entity.getSurname());
        applicationBranchDTO.setEmail(entity.getEmail());
        applicationBranchDTO.setAddress(entity.getAddress());
        applicationBranchDTO.setBirthDay(entity.getBirthDay());
        applicationBranchDTO.setNotes(entity.getNotes());
        applicationBranchDTO.setPhoneNumber(entity.getPhoneNumber());
        applicationBranchDTO.setIdNumber(entity.getIdNumber());
        applicationBranchDTO.setHasRetailExperience(entity.isHasRetailExperience());
        applicationBranchDTO.setInvestmentAmount(entity.getInvestmentAmount());
        applicationBranchDTO.setPreferredTown(entity.getPreferredTown());
        applicationBranchDTO.setPreferredDistrict(entity.getPreferredDistrict());
        applicationBranchDTO.setPreferredCity(entity.getPreferredCity());
        applicationBranchDTO.setReasonOfPrefer(entity.getReasonOfPrefer());

        return applicationBranchDTO;

    }

    public List<ApplicationBranchDTO> convertToDTOList(List<BranchApplicationEntity> entityList){
        List<ApplicationBranchDTO> dtoList = new ArrayList<>();
        for(BranchApplicationEntity entity:entityList){
            ApplicationBranchDTO applicationBranchDTO= convertToDTO(entity);
            dtoList.add(applicationBranchDTO);
        }
        return dtoList;
    }
    public BranchApplicationEntity convertToEntity(ApplicationBranchDTO dto) {
        BranchApplicationEntity branchApplicationEntity = new BranchApplicationEntity();
        branchApplicationEntity.setBranchApplicationId(dto.getBranchApplicationId());
        branchApplicationEntity.setName(dto.getName());
        branchApplicationEntity.setSurname(dto.getSurname());
        branchApplicationEntity.setEmail(dto.getEmail());
        branchApplicationEntity.setAddress(dto.getAddress());
        branchApplicationEntity.setBirthDay(dto.getBirthDay());
        branchApplicationEntity.setNotes(dto.getNotes());
        branchApplicationEntity.setPhoneNumber(dto.getPhoneNumber());
        branchApplicationEntity.setIdNumber(dto.getIdNumber());
        branchApplicationEntity.setHasRetailExperience(dto.isHasRetailExperience());
        branchApplicationEntity.setInvestmentAmount(dto.getInvestmentAmount());
        branchApplicationEntity.setPreferredTown(dto.getPreferredTown());
        branchApplicationEntity.setPreferredDistrict(dto.getPreferredDistrict());
        branchApplicationEntity.setPreferredCity(dto.getPreferredCity());
        branchApplicationEntity.setReasonOfPrefer(dto.getReasonOfPrefer());

        return branchApplicationEntity;

    }

    public List<BranchApplicationEntity> convertToEntityList(List<ApplicationBranchDTO> dtoList){
        List<BranchApplicationEntity> entityList = new ArrayList<>();
        for(ApplicationBranchDTO dto:dtoList){
            BranchApplicationEntity applicationBranchEntity= convertToEntity(dto);
            entityList.add(applicationBranchEntity);
        }
        return entityList;
    }
}
