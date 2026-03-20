package com.thinkworks.payroll.runner;

import com.thinkworks.payroll.dto.Employee;
import com.thinkworks.payroll.dto.Department;
import com.thinkworks.payroll.dto.DepartmentType;
import com.thinkworks.payroll.dto.Designation;
import com.thinkworks.payroll.service.PayRoll;


public class MainRunner {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Alice", Designation.INTERN, 200000, 50000);
        Employee e2 = new Employee(102, "Bob", Designation.JUNIOR_DEVELOPER, 3000, 500);
        Employee e3 = new Employee(103, "Charlie", Designation.SENIOR_DEVELOPER, 6000, 1000);
        Employee e4 = new Employee(104, "Diana", Designation.MANAGER, 8000, 2000);
        Employee e5 = new Employee(105, "Edward", Designation.DIRECTOR, 12000, 3000);


        Department dept = new Department(1, "Development", DepartmentType.DEVELOPMENT,
                new Employee[]{e2, e3, e4});
        Department dept1 = new Department(2, "Human Resources", DepartmentType.HR,
                new Employee[]{e1});
        Department dept2 = new Department(3, "Operations", DepartmentType.OPERATIONS,
                new Employee[]{e5});

        Department[] departments = {dept, dept1, dept2};

        PayRoll service = new PayRoll(departments);

        System.out.println(" Employee Details");
        service.printEmployeeDetails(e1);
        service.printEmployeeDetails(e2);
        service.printEmployeeDetails(e3);
        service.printEmployeeDetails(e4);
        service.printEmployeeDetails(e5);


        System.out.println(" Department Details");
        service.printDepartmentDetails(dept);
        service.printDepartmentDetails(dept1);
        service.printDepartmentDetails(dept2);

        double totalCompanySalary = service.calculateTotalCompanySalary(departments);
        System.out.println(" Total Company Salary");
        System.out.println("Company: " + PayRoll.COMPANY_NAME);
        System.out.println("Total Salary: " + totalCompanySalary);


        System.out.println("High Salary Employees");
        service.findHighSalaryEmployees(new Employee[]{e1, e2, e3, e4, e5});

    }
}
