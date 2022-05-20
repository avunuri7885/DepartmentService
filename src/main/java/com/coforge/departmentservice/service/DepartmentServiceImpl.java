package com.coforge.departmentservice.service;

import com.coforge.departmentservice.entity.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    List<Department> deptList = new ArrayList<>();

    @Override
    public List<Department> getDepartments() {
        Department dept = new Department();
        dept.setDeptId(1);
        dept.setDeptName("HR");
        dept.setDeptAddress("HYD");
        dept.setDeptCode("HYD-HR");
        deptList.add(dept);
        dept = new Department();
        dept.setDeptId(2);
        dept.setDeptName("IT");
        dept.setDeptAddress("BNGLR");
        dept.setDeptCode("BNGLR-IT");
        deptList.add(dept);
        return deptList;
    }
}
