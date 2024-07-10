package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // fields
    private double salary;

    // constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        // registerIn401k();
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "SalariedEmployee: name=" + getName() + ", hireDate=" + getHireDate() +
                ", salary=" + getSalary();
    }
}