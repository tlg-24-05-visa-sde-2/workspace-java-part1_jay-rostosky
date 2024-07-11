package net.human;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class.
 *
 * That is, a class definition written in such a way that instance of it (Person objects),
 * once created, cannot have their properties changed.
 * There are simply no public methods to do so, i.e., it has getters, but NO setters.
 */
class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        super();
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years.
     * This is the period of time between the birthdate and today's date.
     * This is a "derived" property, i.e., it is "calculated" from existing data, not a new field.
     */
    public int age() {
        return Period.between(birthDate(), LocalDate.now()).getYears();
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s: name=%s, birthDate=%s",
                getClass().getSimpleName(), name(), birthDate());
    }
}