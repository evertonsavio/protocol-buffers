import dev.evertonsavio.protobuf.models.BodyStyle;
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
                .setBodyStyle(BodyStyle.COUPE)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(001, newCivic)
                .putModel(002, accord)
                //.putAllModel()
                .build();

        System.out.println(dealer.getModelOrThrow(001));
        System.out.println(dealer.getModelOrThrow(001).getBodyStyle());
        System.out.println(dealer.getModelOrThrow(002).getBodyStyle());

    }

}
