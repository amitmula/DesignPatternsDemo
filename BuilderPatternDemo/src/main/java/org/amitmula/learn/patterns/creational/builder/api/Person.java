package org.amitmula.learn.patterns.creational.builder.api;

public class Person {
	private final String name;
	private final Address address;

	public Person(PersonBuilder pbuilder) {
		this.name = pbuilder._name;
		this.address = pbuilder._address;
	}

	public static class PersonBuilder {
		private String _name;
		private Address _address;

		public PersonBuilder name(final String name) {
			this._name = name;
			return this;
		}

		public PersonBuilder address(final Address address) {
			this._address = address;
			return this;
		}

		public Person getPerson() {
			return new Person(this);
		}

	}

	public static PersonBuilder getBuilder() {
		return new PersonBuilder();
	}

	public String toString() {
		return ("Name :" + this.name + "\nAddress :\n" + this.address);
	}

}
