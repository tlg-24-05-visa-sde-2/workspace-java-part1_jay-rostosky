package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    // constructors
    public Executive() {
        super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    // I "opt-in" to provide my own way of doing it, vs. the default way of doing it
    @Override  // interface TaxPayer (default method)
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    // business methods
    @Override
    public void work() {
        System.out.println(getName() + " is enjoying a nice round of golf");
    }
}