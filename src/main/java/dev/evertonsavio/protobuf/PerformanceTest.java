package dev.evertonsavio.protobuf;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import dev.evertonsavio.protobuf.json.JPerson;
import dev.evertonsavio.protobuf.models.Person;

import java.io.IOException;

public class PerformanceTest {

    public static void main(String[] args) throws IOException {
        // json
        JPerson person1 = new JPerson();
        person1.setName("savio");
        person1.setAge(34);
        ObjectMapper mapper = new ObjectMapper();

        Runnable json = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person1);
                JPerson person = mapper.readValue(bytes, JPerson.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        //protobuf
        Person person2 = Person.newBuilder()
                .setName("savio")
                .setAge(Int32Value.newBuilder().setValue(34).build())
                .build();

        Runnable proto = () -> {
            try {
                byte[] bytes = person2.toByteArray();
                Person person = Person.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 5; i++) {
            runPerformanceTest(json, "JSON");
            runPerformanceTest(proto, "PROTO");
        }

    }

    private static void runPerformanceTest(Runnable runnable, String method){
        long time1 = System.currentTimeMillis();
        for(int i = 0; i< 1_000_000; i++){
            runnable.run();
        }
        long time2 = System.currentTimeMillis();

        System.out.println(method + ": " + (time2 - time1)+ " ms");
    }

}
