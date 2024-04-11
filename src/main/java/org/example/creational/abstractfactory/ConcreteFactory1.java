package org.example.creational.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory<String>{
	@Override
	public String createProductA() {
		return "Objeto A";
	}

	@Override
	public String createProductB() {
		return "Objeto B";
	}
}
