package dev.evertonsavio.protobuf;

import dev.evertonsavio.protobuf.models.Person;

public class PersonDemo {

    public static void main(String[] args) {

    //
        Person savio = Person.newBuilder()
                .setName("Savio")
                .setAge(34)
                .build();

        Person savio2 = Person.newBuilder()
                .setName("Savio2")
                .setAge(34)
                .build();

        System.out.println(savio.equals(savio2));

    }

}
