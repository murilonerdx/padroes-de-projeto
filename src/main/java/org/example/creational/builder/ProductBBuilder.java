package org.example.creational.builder;

public class ProductBBuilder implements Builder<ProductB> {
	private String name;
	private int size;
	private int inventory;

	@Override
	public void name(String name) {
		this.name = name;
	}

	@Override
	public void size(int size) {
		this.size = size;
	}

	@Override
	public int inventory(int inventory) {
		return this.inventory = inventory;
	}

	@Override
	public ProductB build() {
		return new ProductB(this.name, this.size, this.inventory);
	}
}
