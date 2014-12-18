package org.amitmula.learn.patterns.creational.singleton;

public class SingletonClass {

	private SingletonClass() {
	}

	private static SingletonClass instance = null;

	public static SingletonClass getInstance() {
		if (null == instance) {
			synchronized (SingletonClass.class) {
				if (null == instance) {
					instance = new SingletonClass();
				}
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
