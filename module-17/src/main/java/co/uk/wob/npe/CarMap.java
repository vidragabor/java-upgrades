package co.uk.wob.npe;

import co.uk.wob.enums.Color;
import co.uk.wob.model.Car;

import java.util.HashMap;

public class CarMap {
	public static void main(String[] args) {
		HashMap<String, Car> cars = new HashMap<>();
		cars.put("first", new Car("Mercedes", "A", Color.BLACK));
		cars.put("second", new Car("BMW", "1", Color.RED));
		cars.put("third", new Car("Audi", "A1", Color.BLUE));
		cars.put("none", null);
		var color = cars.get("none").getColor().name();
		System.out.println(color);
	}
}
