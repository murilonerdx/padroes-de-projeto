package org.example.creational.abstractfactory;

public class ConcretProduct implements AbstractProduct{

	@Override
	public ProductA createProductA() {
		return new ProductAFactory();
	}

	@Override
	public ProductB createProductB() {
		return new ProductBFactory();
	}
}
