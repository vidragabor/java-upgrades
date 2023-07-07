package co.uk.wob.pattern;

import co.uk.wob.enums.Color;
import co.uk.wob.model.Car;

public class PatternMatching {
	
	public static void main(String[] args) {
		Object o = new Car("Mercedes", "A", Color.BLACK);
		if (o instanceof Car) {
			System.out.println(((Car) o).getManufacturer());
		}
	}
	
}
