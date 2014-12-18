package org.amitmula.learn.patterns.creational.abstractfactory.demo;

import org.amitmula.learn.patterns.creational.abstractfactory.AbstractFactory;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Color;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Shape;
import org.amitmula.learn.patterns.creational.abstractfactory.factory.ColorFactory;
import org.amitmula.learn.patterns.creational.abstractfactory.factory.ShapeFactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory factory = new ShapeFactory();
		Shape shape = factory.getShape("RECTANGLE");
		shape.draw();
		shape = factory.getShape("TRIANGLE");
		shape.draw();
		shape = factory.getShape("SQUARE");
		shape.draw();
		
		factory = new ColorFactory();
		Color color = factory.getColor("RED");
		color.fillColor(color);
		color = factory.getColor("GREEN");
		color.fillColor(color);
		color = factory.getColor("BLUE");
		color.fillColor(color);		
	}
}
