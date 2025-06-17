package utils;

import com.github.javafaker.Faker;

public class RandomDataGenerator {
    static Faker faker = new Faker();
    public static String getRandomInteger (int size){
        return faker.number().digits(size);
    }
    public static String getRandomFullName(){
        return faker.name().fullName();
    }

    public static String getRandomFullName(String s){
        return faker.name().fullName();
    }

    public static String getRandomJob(){
        return faker.job().title();

    }

    public static String getRandomJob(String s){
        return faker.job().title();

    }
}
