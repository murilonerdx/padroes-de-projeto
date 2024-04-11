package org.example.creational.abstractfactory;

public class ProductAFactory implements ProductA{
	@Override
	public Integer size() {
		return 1;
	}

	@Override
	public String name() {
		return "Product A";
	}

	@Override
	public void build() {
		System.out.println("Building ".concat(name()));
	}
}
