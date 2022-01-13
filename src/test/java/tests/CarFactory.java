package tests;

import lombok.extern.log4j.Log4j2;
import com.github.javafaker.Faker;

@Log4j2
public class CarFactory {
    static Faker faker = new Faker();

    public static Car get(){
        log.debug("Создается обьект Car");
        return Car.builder()
                .make(faker.pokemon().name())
                .model(faker.phoneNumber().cellPhone())
                .maxSpeed(160)
                .build();
    }
}
