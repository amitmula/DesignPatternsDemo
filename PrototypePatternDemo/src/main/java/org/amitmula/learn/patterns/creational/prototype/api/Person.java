package org.amitmula.learn.patterns.creational.prototype.api;

public class Person implements Prototype, Cloneable {
	int ssn,age;
	String name;
	
	public Person(int ssn, int age, String name) {
		super();
		this.ssn = ssn;
		this.age = age;
		this.name = name;
	}

	public Prototype getClone() {
		return new Person(ssn, age, name);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String toString() {
		return "Person Name : " + name + "\nPerson SSN : " + ssn + "\nPerson Age" + age; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ssn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ssn != other.ssn)
			return false;
		return true;
	}
}
