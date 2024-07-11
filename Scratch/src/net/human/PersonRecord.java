package net.human;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class, with the following items in the compiled class file (PersonRecord.class):
 *   2 private final fields
 *   2-arg ctor
 *   getters (no setters), and they do not have the "get" prefix
 *   toString()
 */
record PersonRecord(String name, LocalDate birthDate) {

    public int age() {
        return Period.between(birthDate(), LocalDate.now()).getYears();
    }
}
