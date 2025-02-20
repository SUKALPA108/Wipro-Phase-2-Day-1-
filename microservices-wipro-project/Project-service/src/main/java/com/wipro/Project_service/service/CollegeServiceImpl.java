package com.wipro.Project_service.service;

import com.wipro.Project_service.entity.College;
import com.wipro.Project_service.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService{
    @Autowired
    private CollegeRepository collegeRepository;

    @Override
    public College addCollege(College college) {
        return collegeRepository.save(college);
    }

    @Override
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    @Override
    public College getCollegeById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    @Override
    public College getCollegeByName(String name) {
        return collegeRepository.findByName(name);
    }

    @Override
    public College updateCollegeName(Long id, String name) {
        College college = collegeRepository.findById(id).orElse(null);
        if (college != null) {
            college.setName(name);
            collegeRepository.save(college);
        }
        return college;
    }

    @Override
    public void deleteCollege(Long id) {
        collegeRepository.deleteById(id);
    }
}