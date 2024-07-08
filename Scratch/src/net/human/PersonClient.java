package net.human;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Jay", LocalDate.of(1966, 12, 5));

        // print the following: <name> is <age> years old
        System.out.printf("%s is %s years old\n", p1.name(), p1.age());

        System.out.println(p1);  // toString() automatically called
    }
}