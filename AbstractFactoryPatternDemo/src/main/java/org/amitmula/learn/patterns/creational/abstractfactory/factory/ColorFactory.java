package org.amitmula.learn.patterns.creational.abstractfactory.factory;

import org.amitmula.learn.patterns.creational.abstractfactory.AbstractFactory;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Blue;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Color;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Green;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Red;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {		
		switch(color) {
		case "RED":
			return new Red();
		case "GREEN":
			return new Green();
		case "BLUE":
			return new Blue();
		}		
		return null;
	}

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
