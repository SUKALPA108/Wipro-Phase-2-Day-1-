package com.wipro.Project_service.repository;


import com.wipro.Project_service.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
    College findByName(String name);
}
