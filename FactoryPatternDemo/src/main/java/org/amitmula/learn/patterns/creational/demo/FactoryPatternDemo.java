package org.amitmula.learn.patterns.creational.demo;

import org.amitmula.learn.patterns.creational.api.Shape;
import org.amitmula.learn.patterns.creational.factory.ShapeFactory;

enum ShapeCode {
	RECTANGLE(0), SQUARE(1), CIRCLE(2);
	private final int shapeCode;

	ShapeCode(int code) {
		this.shapeCode = code;
	}

	int getShapeCode() {
		return shapeCode;
	}
}

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeCode code = ShapeCode.CIRCLE;
		Shape shape = ShapeFactory.getShape(code.getShapeCode());
		shape.draw();

		code = ShapeCode.RECTANGLE;
		shape = ShapeFactory.getShape(code.getShapeCode());
		shape.draw();

		code = ShapeCode.SQUARE;
		shape = ShapeFactory.getShape(code.getShapeCode());
		shape.draw();
	}
}
