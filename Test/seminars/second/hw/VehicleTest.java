package seminars.second.hw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import seminars.second.simple_shopping_cart.Cart;
import seminars.second.simple_shopping_cart.Main;
import seminars.second.simple_shopping_cart.Shop;

class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void initEach() {
        this.car = new Car("company1", "model1", 2020);
        this.motorcycle = new Motorcycle("company2", "model53535", 2021);
    }

    @Test
    void carInstanceIsInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carObjectCreatedWith4Wheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleObjectCreatedWith2Wheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carObjectHasSpeed60InTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleObjectHasSpeed75InTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carSpeedIs0InParkingMode() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleSpeedIs0InParkingMode() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}