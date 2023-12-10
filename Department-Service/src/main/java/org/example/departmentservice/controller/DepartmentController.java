package org.example.departmentservice.controller;

import org.example.departmentservice.entity.Department;
import org.example.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    private Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {

        return departmentService.findByDepartmentId(departmentId);
    }
}
