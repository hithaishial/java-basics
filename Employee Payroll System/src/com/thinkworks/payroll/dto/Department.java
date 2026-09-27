package com.thinkworks.payroll.dto;

public class Department {

    private int deptId;
    private String deptName;
    private DepartmentType departmentType;
    private Employee[] employees;
    public static double totalDeptSalary = 0;

    public Department(int deptId, String deptName, DepartmentType departmentType, Employee[] employees) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.departmentType = departmentType;
        this.employees = employees;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double calculateDepartmentSalary(){

        if(employees != null){
            for(Employee employee: employees){

                totalDeptSalary=0;
                totalDeptSalary = totalDeptSalary + employee.calculateAnnualSalary();
            }
        }
        else System.out.println("value is null, please re enter the value" );

        return totalDeptSalary;
    }

}
