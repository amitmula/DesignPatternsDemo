package org.amitmula.learn.patterns.creational.abstractfactory.factory;

import org.amitmula.learn.patterns.creational.abstractfactory.AbstractFactory;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Color;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Rectangle;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Shape;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Square;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Triangle;
public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String type) {
		switch(type) {
		case "TRIANGLE":
			return new Triangle();
		case "SQUARE":
			return new Square();
		case "RECTANGLE":
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
