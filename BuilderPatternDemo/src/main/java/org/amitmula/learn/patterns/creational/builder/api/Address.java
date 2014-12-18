package org.amitmula.learn.patterns.creational.builder.api;

public class Address {

	private final String plot, street, city, state, country, pincode;

	public Address(AddressBuilder builder) {
		this.plot = builder._plot;
		this.street = builder._street;
		this.city = builder._city;
		this.state = builder._state;
		this.country = builder._country;
		this.pincode = builder._pincode;
	}

	public static class AddressBuilder {
		String _plot, _street, _city, _state, _country, _pincode;

		public AddressBuilder plot(String plot) {
			this._plot = plot;
			return this;
		}

		public AddressBuilder street(String street) {
			this._street = street;
			return this;
		}

		public AddressBuilder city(String city) {
			this._city = city;
			return this;
		}

		public AddressBuilder state(String state) {
			this._state = state;
			return this;
		}

		public AddressBuilder country(String country) {
			this._country = country;
			return this;
		}

		public AddressBuilder pincode(String pincode) {
			this._pincode = pincode;
			return this;
		}

		public Address getHomeAddress() {
			return new Address(this);
		}
	}

	public static AddressBuilder getBuilder() {
		return new AddressBuilder();
	}

	public String toString() {
		return (this.plot + ", " + this.street + "\n" + this.city + ", "
				+ this.state + " - " + this.pincode + "\n" + this.country);
	}

}
