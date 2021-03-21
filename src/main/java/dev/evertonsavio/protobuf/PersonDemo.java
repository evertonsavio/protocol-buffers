package dev.evertonsavio.protobuf;

import dev.evertonsavio.protobuf.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {

    public static void main(String[] args) throws IOException {

        Person savio = Person.newBuilder()
                .setName("Savio")
                .setAge(34)
                .build();

        Path path = Paths.get("Savio.ser");
        Files.write(path, savio.toByteArray());

        byte[] bytes = Files.readAllBytes(path);
        Person newSavio = Person.parseFrom(bytes);

        System.out.println(newSavio.toString());
    }

}
