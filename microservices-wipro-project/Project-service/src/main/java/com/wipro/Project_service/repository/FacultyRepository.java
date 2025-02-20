package com.wipro.Project_service.repository;
import java.util.List;

import com.wipro.Project_service.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findByDepartmentName(String departmentName);
}