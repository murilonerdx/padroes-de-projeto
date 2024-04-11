package org.example.creational.abstractfactory;

public class Application {
	private final ProductA productA;
	private final ProductB productB;

	public Application(AbstractProduct abstractProduct){
		this.productA = abstractProduct.createProductA();
		this.productB = abstractProduct.createProductB();
	}

	public void print(){
		productA.build();
		productB.build();
	}
}
