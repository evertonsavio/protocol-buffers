package dev.evertonsavio.protobuf;

import dev.evertonsavio.protobuf.models.Television;
import dev.evertonsavio.protobuf.models.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VersionCompatibilityTest {

    public static void main(String[] args) throws IOException {
//        Television television = Television.newBuilder()
//                .setBrand("sony")
//                .setModel(2123)
//                .setType(Type.OLED)
//                .build();
//
//        Path path2 = Paths.get("tv-v2");
//        Files.write(path2, television.toByteArray());

        //
//        Path path1 = Paths.get("tv-v1");
        Path path2 = Paths.get("tv-v2");
        byte[] bytes = Files.readAllBytes(path2);
        System.out.println(Television.parseFrom(bytes));
        System.out.println(Television.parseFrom(bytes).getType());

    }

}
