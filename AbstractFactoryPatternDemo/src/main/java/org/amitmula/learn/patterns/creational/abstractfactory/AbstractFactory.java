package org.amitmula.learn.patterns.creational.abstractfactory;

import org.amitmula.learn.patterns.creational.abstractfactory.api.Color;
import org.amitmula.learn.patterns.creational.abstractfactory.api.Shape;

public abstract class AbstractFactory {
	 abstract public Shape getShape(String type);
	 abstract public Color getColor(String color);
}
