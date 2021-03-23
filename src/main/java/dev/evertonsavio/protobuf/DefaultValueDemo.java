package dev.evertonsavio.protobuf;

import dev.evertonsavio.protobuf.models.Person;

public class DefaultValueDemo {

    public static void main(String[] args) {

        Person person = Person.newBuilder().build();
        System.out.println("CITY:" + person.getAddress().getCity());
        System.out.println(person.hasAddress());
    }
}
