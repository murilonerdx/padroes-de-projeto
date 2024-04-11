package org.example.creational.builder;

public class ProductBBuilder implements Builder<ProductBBuilder, ProductB> {
	private String name;
	private int size;
	private int inventory;

	@Override
	public ProductBBuilder name(String name) {
		this.name = name;
		return this;
	}

	@Override
	public ProductBBuilder size(int size) {
		this.size = size;
		return this;
	}

	@Override
	public ProductBBuilder inventory(int inventory) {
		this.inventory = inventory;
		return this;
	}

	@Override
	public ProductB build() {
		return new ProductB(this.name, this.size, this.inventory);
	}
}
