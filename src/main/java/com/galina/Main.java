package com.galina;

import com.galina.address.Address;
import com.galina.address.PostalAddress;
import com.galina.person.Person;
import com.galina.person.PersonImpl;

public class Main {

    public static void main(String[] args) {
        Person person1 = new PersonImpl("Anna", "Denisova");
        String lastName = person1.getLastName();
        System.out.println(lastName);

        Address address = new PostalAddress(60010, "Georgia", "Batumi", "Gorgiladze 51");
        System.out.println(address);


    }
}
