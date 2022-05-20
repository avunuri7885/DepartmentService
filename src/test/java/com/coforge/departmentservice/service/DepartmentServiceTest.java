package com.coforge.departmentservice.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DepartmentServiceTest {

    @Test
    public void getDepartmentsTest(){
    DepartmentService departmentService = new DepartmentServiceImpl();
        Assertions.assertEquals(2,departmentService.getDepartments().size());
    }
}
