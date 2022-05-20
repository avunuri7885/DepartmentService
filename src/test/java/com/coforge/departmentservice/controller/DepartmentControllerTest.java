package com.coforge.departmentservice.controller;


import com.coforge.departmentservice.entity.Department;
import com.coforge.departmentservice.service.DepartmentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalManagementPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DepartmentControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;
    @LocalManagementPort
    private int port;

    @Test
    public void getDepartmentTets(){
        Department[] departments = testRestTemplate.getForObject("http://localhost:"+port+"/departments", Department[].class);
        Assertions.assertEquals(2, departments.length);
    }
}
