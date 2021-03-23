import dev.evertonsavio.protobuf.models.Car;
import dev.evertonsavio.protobuf.models.Dealer;

public class MapDemo {

    public static void main(String[] args) {


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

        Dealer dealer = Dealer.newBuilder()
                .putModel(001, newCivic)
                .putModel(002, accord)
                //.putAllModel()
                .build();

        System.out.println(dealer.getModelOrThrow(001));

    }

}
