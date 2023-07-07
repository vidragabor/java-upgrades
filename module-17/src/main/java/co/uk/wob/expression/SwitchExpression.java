package co.uk.wob.expression;

import lombok.val;

import java.time.DayOfWeek;
import java.util.Random;

public class SwitchExpression {
	public static void main(String[] args) {
		var day = DayOfWeek.of(new Random().nextInt(1, 7));
		
		switch (day) {
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday, day: " + day);
			case SATURDAY, SUNDAY -> System.out.println("It is a weekend, day: " + day);
		}
		
		val typeOfDay = switch (day) {
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "It is a weekday, day: " + day;
			case SATURDAY, SUNDAY -> "It is a weekend, day: " + day;
		};
		System.out.println(typeOfDay);
	}
}
