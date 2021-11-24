package com.serge.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{

    private int id;
    private String name;
    private List<Department> childDepartments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        childDepartments = new ArrayList<>();
    }

    @Override
    public void showDepartment() {
        childDepartments.forEach(Department::showDepartment);
    }

    public void addChildDepartment(Department department){
        childDepartments.add(department);
    }

    public void removeChildDepartment(Department department){
        childDepartments.remove(department);
    }


}
