package com.galina.person;

public class PersonImpl implements Person {
    private final String firstName;
    private final String lastName;

    public PersonImpl(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + " firstName: " + firstName + " lastName: " + lastName;
    }
}
