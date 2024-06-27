package org.example.creational.factorymethod;

import org.example.creational.builder.Product;

public abstract class Creator_ {
	abstract Product_ factoryMethod();

	public void someOperation() {
		Product_ product = factoryMethod();
		product.doStuff();
	}
}
