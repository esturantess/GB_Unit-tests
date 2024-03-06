package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import seminars.second.simple_shopping_cart.Cart;
import seminars.second.simple_shopping_cart.Main;
import seminars.second.simple_shopping_cart.Shop;

//        - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
//
//        - Проверить, что объект Car создается с 4-мя колесами.
//
//        - Проверить, что объект Motorcycle создается с 2-мя колесами.
//
//        - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
//
//        - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
//
//        - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
//
//        - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

class VehicleTest {


    @Test
    void carInstanceIsInstanceOfVehicle() {
        Car car1 = new Car("company1", "model1", 2020);
        assertThat(car1).isInstanceOf(Vehicle.class);
    }

    @Test
    void carObjectCreatedWith4Wheels() {
        Car car2 = new Car("company3", "model3", 2019);
        assertThat(car2.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleObjectCreatedWith2Wheels() {
        Motorcycle motorcycle1 = new Motorcycle("company2", "model53535", 2021);
        assertThat(motorcycle1.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carObjectHasSpeed60InTestDrive() {
        Car car3 = new Car("company4", "model4", 2024);
        car3.testDrive();
        assertThat(car3.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleObjectHasSpeed75InTestDrive() {
        Motorcycle motorcycle2 = new Motorcycle("company3", "model23242", 2023);
        motorcycle2.testDrive();
        assertThat(motorcycle2.getSpeed()).isEqualTo(75);
    }

    @Test
    void carSpeedIs0InParkingMode() {
        Car car4 = new Car("company1", "model7", 2024);
        car4.testDrive();
        car4.park();
        assertThat(car4.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleSpeedIs0InParkingMode() {
        Motorcycle motorcycle3 = new Motorcycle("company2", "model42", 2024);
        motorcycle3.testDrive();
        motorcycle3.park();
        assertThat(motorcycle3.getSpeed()).isEqualTo(0);
    }

}