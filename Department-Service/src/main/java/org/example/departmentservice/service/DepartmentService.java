package org.example.departmentservice.service;

import lombok.extern.slf4j.Slf4j;
import org.example.departmentservice.entity.Department;
import org.example.departmentservice.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;


    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepo.save(department);
    }


    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside findByDepartmentId of DepartmentService");
        return departmentRepo.findByDepartmentId(departmentId);
    }
}
