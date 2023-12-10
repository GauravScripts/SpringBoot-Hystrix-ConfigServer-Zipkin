package org.example.departmentservice.repository;

import org.example.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);
}
