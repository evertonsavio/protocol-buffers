import dev.evertonsavio.protobuf.models.Address;
import dev.evertonsavio.protobuf.models.Car;
import dev.evertonsavio.protobuf.models.Person;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {

    public static void main(String[] args) {


        Address address = Address.newBuilder()
                .setPostbox(123)
                .setStreet("main street")
                .setCity("Atlanta")
                .build();

        Car newCivic = Car.newBuilder()
                .setModel("Honda")
                .setModel("NewCivic")
                .setYear(2021)
                .build();

        Car accord = Car.newBuilder()
                .setModel("Accord")
                .setModel("NewCivic")
                .setYear(2021)
                .build();

        List<Car> cars = new ArrayList<>();
        cars.add(newCivic);
        cars.add(accord);

        Person savio = Person.newBuilder()
                .setName("Savio")
                .setAge(34)
                .addCar(newCivic)
                .addCar(accord)
                //.addAllCar(cars);
                .setAddress(address)
                .build();

        System.out.println(savio);


    }

}
