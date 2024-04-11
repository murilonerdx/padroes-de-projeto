package org.example.creational.builder;

public class ProductBuilder implements Builder<Product> {
	private String name;
	private int size;

	@Override
	public void name(String name) {
		this.name = name;
	}

	@Override
	public void size(int size) {
		this.size = size;
	}

	@Override
	public Product build() {
		return new Product(this.name, this.size);
	}
}
