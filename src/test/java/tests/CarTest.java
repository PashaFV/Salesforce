package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

@Log4j2
public class CarTest {

    @Test
    public void сarTest(){
        log.info("Старт теста carTest");
        Car car1 = CarFactory.get();
        car1.setMake("BMW");
        Car car2 = CarFactory.get();
        car2.setMake("BMW");

        assertEquals(car1, car2,"Автомобили не равны");
        log.info("Завершение теста carTest");
    }
}
