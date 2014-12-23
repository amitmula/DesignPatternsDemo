package org.amitmula.learn.patterns.creational.prototype.demo;

import org.amitmula.learn.patterns.creational.prototype.api.Person;

public class PrototypePatternDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1 = new Person(1001,25,"Amit");
		Person person2 = (Person)person1.getClone();
		Person person3 = (Person) person1.clone();
		System.out.println(person1 + "" + person1.hashCode());
		System.out.println(person2 + "" + person2.hashCode());
		System.out.println(person3);
		
		System.out.print("person1 == person2 evaluates to :");
		System.out.println(person1 == person2);		
		System.out.print("person1.equals(person2) evaluates to :");
		System.out.println(person1.equals(person2));
		
		System.out.print("person1 == person3 evaluates to :");
		System.out.println(person1 == person3);
		System.out.print("person1.equals(person3) evaluates to :");
		System.out.println(person1.equals(person3));
		
	}

}
