package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountFactory {

    static Faker faker = new Faker();

    public static Account get() {
        log.debug("Создается обьект Account");
        return Account.builder()
                .accountName(faker.artist().name())
                .webSite(faker.harryPotter().location())
                .type("Analyst")
                .phone(faker.phoneNumber().phoneNumber())
                .employees(faker.pokemon().name())
                .industry("Agriculture")
                .description(faker.harryPotter().spell())
                .billingStreet(faker.harryPotter().location())
                .shippingStreet(faker.harryPotter().location())
                .build();


    }

}
