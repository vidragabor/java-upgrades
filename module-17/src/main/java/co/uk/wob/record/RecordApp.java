package co.uk.wob.record;

import co.uk.wob.record.model.Person;

public class RecordApp {
	public static void main(String[] args) {
		Person person = new Person("Kovács Béla", 25);
		System.out.println(person.name() + ", " + person.age());
		System.out.println(person.toString());
		System.out.println(person.hashCode());
	}
}
