package restassured.utils;

import java.util.concurrent.ThreadLocalRandom;

/**
 * author : egribanov
 * created : 08.03.2022, 13:35
 **/
public class StringUtils {
    private static final String ALL_NUMERICAL = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ILLEGAL_CHARACTERS = "!@#№%^&*,'|/}{+=";

    public static String getRandomString(int stringLength) {
        StringBuilder stringBuilder = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            stringBuilder.append(ALL_NUMERICAL.charAt(ThreadLocalRandom.current().nextInt(ALL_NUMERICAL.length())));
        }
        return stringBuilder.toString();
    }

    public static String getRandomIllegalCharactersString(int stringLength) {
        StringBuilder stringBuilder = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            stringBuilder.append(ILLEGAL_CHARACTERS.charAt(ThreadLocalRandom.current().nextInt(ILLEGAL_CHARACTERS.length())));
        }
        return stringBuilder.toString();
    }

    public static int getRandomNumberAsString(int minNumber, int maxNumber) {
        return ThreadLocalRandom.current().nextInt(minNumber, maxNumber);
    }
}
