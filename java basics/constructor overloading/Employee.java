class Employee {
    String employeeId;
    String name;
    String department;
    String designation;
    String email;
    int age;
    double salary;
    long phoneNumber;
    String address;
    boolean isActive;

    static int count = 0;

    Employee(String employeeId, String name, String department, String designation, String email,
             int age, double salary, long phoneNumber, String address, boolean isActive) {
        this(name, department, designation, email, age, salary, phoneNumber, address, isActive);
        this.employeeId = employeeId;
        System.out.println("Employee ID: " + employeeId);
    }

    Employee(String name, String department, String designation, String email,
             int age, double salary, long phoneNumber, String address, boolean isActive) {
        this(department, designation, email, age, salary, phoneNumber, address, isActive);
        this.name = name;
        System.out.println("Name: " + name);
    }

    Employee(String department, String designation, String email,
             int age, double salary, long phoneNumber, String address, boolean isActive) {
        this(designation, email, age, salary, phoneNumber, address, isActive);
        this.department = department;
        System.out.println("Department: " + department);
    }

    Employee(String designation, String email, int age,
             double salary, long phoneNumber, String address, boolean isActive) {
        this(email, age, salary, phoneNumber, address, isActive);
        this.designation = designation;
        System.out.println("Designation: " + designation);
    }

    Employee(String email, int age, double salary,
             long phoneNumber, String address, boolean isActive) {
        this(age, salary, phoneNumber, address, isActive);
        this.email = email;
        System.out.println("Email: " + email);
    }

    Employee(int age, double salary, long phoneNumber, String address, boolean isActive) {
        this(salary, phoneNumber, address, isActive);
        this.age = age;
        System.out.println("Age: " + age);
    }

    Employee(double salary, long phoneNumber, String address, boolean isActive) {
        this(phoneNumber, address, isActive);
        this.salary = salary;
        System.out.println("Salary: " + salary);
    }

    Employee(long phoneNumber, String address, boolean isActive) {
        this(address, isActive);
        this.phoneNumber = phoneNumber;
        System.out.println("Phone Number: " + phoneNumber);
    }

    Employee(String address, boolean isActive) {
        this(isActive);
        this.address = address;
        System.out.println("Address: " + address);
    }

    Employee(boolean isActive) {
        this();
        this.isActive = isActive;
        System.out.println("Is Active: " + isActive);
    }

    Employee() {
        System.out.println("constructor: Employee");
        count++;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Is Active: " + isActive);
        System.out.println("Total Employees created: " + count);
    }
}