package com.thinkworks.payroll.dto;

public class Employee {

    private int empId;
    private String name;
    private Designation designation;
    private double salary;
    private double bonus;

    public Employee(int empId, String name, Designation designation, double salary, double bonus) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    static {
        System.out.println("Payroll System Ready");
    }

    {
        System.out.println("Employee object created");
    }

    public double calculateAnnualSalary(){

        double annualSalary;
        annualSalary = (salary + bonus) *12;
        return annualSalary;
    }
}
