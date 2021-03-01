package com.lee;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName Department
 * @Description TODO
 * @Author lwq
 * @Date 2021/2/27 14:57
 * @Version 1.0
 */
public class Department implements Serializable {
    private Integer id;
    private String deptName;

    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
