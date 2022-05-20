package com.coforge.departmentservice.controller;

import com.coforge.departmentservice.entity.Department;
import com.coforge.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(value = "/departments")
    public List<Department> getDepartments(){
        return departmentService.getDepartments();
    }

}
