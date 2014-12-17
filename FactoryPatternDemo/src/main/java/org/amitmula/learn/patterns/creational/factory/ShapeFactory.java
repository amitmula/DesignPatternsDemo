package org.amitmula.learn.patterns.creational.factory;

import org.amitmula.learn.patterns.creational.api.Circle;
import org.amitmula.learn.patterns.creational.api.Rectangle;
import org.amitmula.learn.patterns.creational.api.Shape;
import org.amitmula.learn.patterns.creational.api.Square;

public class ShapeFactory {
	public static Shape getShape(int shape) {
		switch(shape) {
			case 0:
				return new Square();
				
			case 1:
				return new Circle();
				
			case 2:
				return new Rectangle();
			default:
				return null;				
		}
	}
}