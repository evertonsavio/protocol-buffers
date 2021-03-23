package dev.evertonsavio.protobuf;

import com.google.protobuf.Int32Value;
import dev.evertonsavio.protobuf.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {

    public static void main(String[] args) throws IOException {

        Person savio = Person.newBuilder()
                .setName("Savio")
                .setAge(Int32Value.newBuilder().setValue(34).build())
                .build();

        Path path = Paths.get("Savio.ser");
        Files.write(path, savio.toByteArray());

        byte[] bytes = Files.readAllBytes(path);
        Person newSavio = Person.parseFrom(bytes);

        System.out.println(newSavio.toString());
    }

}
