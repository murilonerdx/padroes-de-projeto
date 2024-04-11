package org.example.creational.builder;

public class ProductBuilder implements Builder<ProductBuilder, Product> {
	private String name;
	private int size;

	@Override
	public ProductBuilder name(String name) {
		this.name = name;
		return this;
	}

	@Override
	public ProductBuilder size(int size) {
		this.size = size;
		return this;
	}

	@Override
	public ProductBuilder inventory(int inventory) {
		return this;
	}

	@Override
	public Product build() {
		return new Product(this.name, this.size);
	}
}
