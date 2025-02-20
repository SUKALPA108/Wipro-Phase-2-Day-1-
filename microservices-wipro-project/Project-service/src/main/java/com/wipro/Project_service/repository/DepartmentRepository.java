package com.wipro.Project_service.repository;
import java.util.List;
import com.wipro.Project_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByCollegeName(String collegeName);
}