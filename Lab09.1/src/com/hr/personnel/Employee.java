/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 *
 * Properties:
 *   String name
 *   LocalDate hireDate
 *
 * Methods (excluding get/set methods):
 *   void work()        simulates work by printing a message to show it was called.
 *   String toString()  self-explanatory.
 */
public abstract class Employee implements TaxPayer {
    // fields
    private String name;
    private LocalDate hireDate;

    // constructors
    public Employee() {
        super();
    }

    public Employee(String name, LocalDate hireDate) {
        super();
        setName(name);
        setHireDate(hireDate);
    }

    // business methods
    // ALL Employees work(), so the method goes up here
    // They all work() the same way, i.e., "hard," so we code it up here, too
    // It's inherited by both subclasses, NOT overridden
    public void work() {
        System.out.println(getName() + " working hard since " + getHireDate());
    }

    // ALL Employees get paid, so the method goes up here
    // BUT they don't do it the same way - SE is fixed-salary, HE is rate*hours
    // We need a way to say THAT "all Employees get paid," BUT we don't know HOW (up here).
    // All we have is name and hireDate, we can't get the dollar figure
    public abstract void pay();

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName() + ", hireDate=" + getHireDate();
    }
}