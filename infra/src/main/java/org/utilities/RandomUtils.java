
package org.utilities;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
// Utility class for generating random data, including names, phone numbers, addresses, and emails, using the Faker library.

public class RandomUtils {
    private static final Random random = new Random();
    private static final Faker faker = new Faker();

    public static String randomString(int numOfDigit) {
        return RandomStringUtils.randomAlphabetic(numOfDigit);
    }

    public static String randomFirstName() {
        return faker.name().firstName();
    }

    public static String randomLastName() {
        return faker.name().lastName();
    }

    public static String randomCity() {
        return faker.address().city();
    }

    public static Long randomLong(int numOfDigit) {
        String longStringRandom = RandomStringUtils.random(numOfDigit, false, true);
        return Long.valueOf(longStringRandom);
    }

    public static Long randomPhone() {
        String longStringRandom = RandomStringUtils.random(10, false, true);
        return Long.valueOf(longStringRandom);
    }

    public static String randomTruePhone() {
        return "^0(([5,7]\\d{6,7})|([2-4,8-9]\\d{6}))$";
    }

    public static String randomEmail() {
        String localPart = faker.internet().emailAddress().split("@")[0];
        String domain = faker.internet().domainName();
        return localPart + "@" + domain;
    }

    public static String randomFullPhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public static String randomAddress() {
        return faker.address().streetAddress() + ", " + faker.address().city() + ", " + faker.address().country();
    }
}
