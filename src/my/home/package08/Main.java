package my.home.package08;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        String encrypted = "Pass_1";
        MessageDigest messageDigest = null;
        byte[] bytesEncoded = null;

        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(encrypted.getBytes(StandardCharsets.UTF_8));
            bytesEncoded = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        BigInteger bigInt = new BigInteger(1, bytesEncoded);
        String resHex = bigInt.toString();
        System.out.println(resHex);

    }
}
