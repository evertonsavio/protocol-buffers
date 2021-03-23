package dev.evertonsavio.protobuf;

import dev.evertonsavio.protobuf.models.Credentials;
import dev.evertonsavio.protobuf.models.EmailCredentials;
import dev.evertonsavio.protobuf.models.PhoneOTP;

public class OneOfDemo {

    public static void main(String[] args) {

        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("everluca@hotmail.com")
                .setPassword("admin")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(123123123)
                .setCode(123)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setEmailMode(emailCredentials) //ERASED
                .setPhoneMode(phoneOTP)
                .build();

        login(credentials);

    }

    private static void login(Credentials credentials){

        //System.out.println("WAS DELETED: BLANK" + credentials.getEmailMode());
        //System.out.println(credentials.getPhoneMode());

        switch (credentials.getModeCase()){
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getEmailMode());
                break;
        }
    }
}
