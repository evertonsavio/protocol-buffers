import dev.evertonsavio.protobuf.models.Address;
import dev.evertonsavio.protobuf.models.Car;
import dev.evertonsavio.protobuf.models.Person;

public class CompositionDemo {

    public static void main(String[] args) {


        Address address = Address.newBuilder()
                .setPostbox(123)
                .setStreet("main street")
                .setCity("Atlanta")
                .build();

        Car car = Car.newBuilder()
                .setModel("Honda")
                .setModel("Accord")
                .setYear(2021)
                .build();

        Person savio = Person.newBuilder()
                .setName("Savio")
                .setAge(34)
                .setCar(car)
                .setAddress(address)
                .build();

        System.out.println(savio);


    }

}
