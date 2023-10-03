package com.bulutmd.repository;

import com.bulutmd.entity.BranchApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchApplicationRepository extends JpaRepository<BranchApplicationEntity,Long> {
}
