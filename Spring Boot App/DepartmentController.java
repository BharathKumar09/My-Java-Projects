he Below program is for DepartmentController.java which is used to make operations on the Database to obtain the Desired Results 

package com.amiya.springbootdemoproject.controller;
 
import com.demo1.springbootdemoproject.entity.Department;
import com.demo1.springbootdemoproject.service.DepartmentService;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 

@RestController

public class DepartmentController {
 
    private DepartmentService departmentService;
 
   
    @PostMapping("/departments")
 
    public Department saveDepartment(Department department)
    {
        return departmentService.saveDepartment(department);
    }
 
   
    @GetMapping("/departments")
 
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }
 
    @PutMapping("/departments/{id}")
 
    public Department
    updateDepartment(Long departmentId)
    {
        return departmentService.updateDepartment(
            department, departmentId);
    }
 
    @DeleteMapping("/departments/{id}")
 
    public String deleteDepartmentById(Long departmentId)
    {
        departmentService.deleteDepartmentById(
            departmentId);
        return "Deleted Successfully";
    }
}