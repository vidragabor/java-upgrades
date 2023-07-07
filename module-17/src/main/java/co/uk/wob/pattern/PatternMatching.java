package co.uk.wob.pattern;

import co.uk.wob.record.model.Person;

public class PatternMatching {
	public static void main(String[] args) {
		Object o = new Person("Mario", 10);
		if (o instanceof Person person) {
			System.out.println(person.name());
		}
	}
}
