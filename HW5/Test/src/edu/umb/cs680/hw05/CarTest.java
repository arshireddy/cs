package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carInfo = {car.getMake(), car.getModel(), Integer.toString(car.getYear())};
		return carInfo;
	}
	
	@Test
	void verifyCar() {
		String[] expected = {"Benz", "cla", "2019"};
		Car actual = new Car("Benz", "cla", 2019, 15, 30000);
		assertArrayEquals(expected, carToStringArray(actual) );
	}
	
}
