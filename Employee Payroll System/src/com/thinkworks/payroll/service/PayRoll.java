package com.thinkworks.payroll.service;

import com.thinkworks.payroll.dto.Department;
import com.thinkworks.payroll.dto.Employee;

public class PayRoll {

    public static final String COMPANY_NAME = "TechCorp Pvt Ltd";
    private Department[] depts;
    private static double totalCompanySalary = 0;

    public PayRoll(Department[] depts) {
        this.depts = depts;
    }

    public Department[] getDepts() {
        return depts;
    }

    public void setDepartments(Department[] depts) {
        this.depts = depts;
    }

    public void printEmployeeDetails(Employee emp){

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee name: " + emp.getName());
        System.out.println("Designation of the employee: " + emp.getDesignation());
        System.out.println("Salary of the employee: " + emp.getSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("The annual salary of the employee: " + emp.calculateAnnualSalary());
    }

    public void printDepartmentDetails(Department dept){

        System.out.println("Department ID: " + dept.getDeptId());
        System.out.println("Department name: " + dept.getDeptName());
        System.out.println("Department type: " + dept.getDepartmentType());
        System.out.println("Employees list: " + dept.getEmployees());
        System.out.println("Total salary of the Department: " + dept.calculateDepartmentSalary());
    }

    public double calculateTotalCompanySalary(Department[] depts){

        if (depts != null){
            for (Department department: depts){

                totalCompanySalary = 0;
                totalCompanySalary = totalCompanySalary + department.calculateDepartmentSalary();
            }
        }
        else System.out.println("the value is null, please re enter the value");

        return totalCompanySalary;
    }

    public void findHighSalaryEmployees(Employee[] employees){
         if (employees != null){
             for (Employee employee: employees){
                 if (employee.getSalary() >= 50000){
                     System.out.println("high salary paid employees are: " + employee.getName());
                 }
             }
         }
         else System.out.println("the value is null");
    }


}
