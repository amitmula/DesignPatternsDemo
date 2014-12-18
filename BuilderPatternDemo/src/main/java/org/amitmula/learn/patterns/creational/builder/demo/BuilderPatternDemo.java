package org.amitmula.learn.patterns.creational.builder.demo;

import org.amitmula.learn.patterns.creational.builder.api.Address;
import org.amitmula.learn.patterns.creational.builder.api.Person;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		Person person = Person
				.getBuilder()
				.name("Amit Mula")
				.address(
						Address.getBuilder().plot("Plot No. 14")
								.street("Sector-18").city("Gurgaon")
								.state("Haryana").pincode("12368127")
								.country("IN").getHomeAddress()).getPerson();
		System.out.println(person.toString());
	}
}
