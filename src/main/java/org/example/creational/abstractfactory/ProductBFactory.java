package org.example.creational.abstractfactory;

public class ProductBFactory implements ProductB{

	@Override
	public String name() {
		return "Product B";
	}

	@Override
	public void build() {
		System.out.println("Building ".concat(name()));
	}

}
