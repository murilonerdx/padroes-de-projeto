package org.example.creational.factorymethod;

public class ConcreteCreator2_ extends Creator_ {
	@Override
	Product_ factoryMethod() {
		return new ConcreteProduct2_();
	}
}
