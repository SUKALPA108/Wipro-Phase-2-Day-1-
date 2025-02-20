package com.wipro.Project_service.Controller;


import com.wipro.Project_service.entity.College;
import com.wipro.Project_service.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colleges")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @PostMapping
    public College addCollege(@RequestBody College college) {
        return collegeService.addCollege(college);
    }

    @GetMapping
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable Long id) {
        return collegeService.getCollegeById(id);
    }

    @GetMapping("/name/{name}")
    public College getCollegeByName(@PathVariable String name) {
        return collegeService.getCollegeByName(name);
    }

    @PutMapping("/{id}")
    public College updateCollegeName(@PathVariable Long id, @RequestParam String name) {
        return collegeService.updateCollegeName(id, name);
    }

    @DeleteMapping("/{id}")
    public void deleteCollege(@PathVariable Long id) {
        collegeService.deleteCollege(id);
    }
}
