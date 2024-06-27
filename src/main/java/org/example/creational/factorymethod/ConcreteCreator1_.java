package org.example.creational.factorymethod;

public class ConcreteCreator1_ extends Creator_ {
	@Override
	Product_ factoryMethod() {
		return new ConcreteProduct1_();
	}
}
