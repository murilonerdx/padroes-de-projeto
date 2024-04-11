package org.example.creational.builder;

public class ProductB {
	private String name;
	private Integer size;
	private int inventory;

	public ProductB(String name, Integer size, int inventory) {
		this.name = name;
		this.size = size;
		this.inventory = inventory;
	}

	public ProductB(String name, Integer size) {
		this.name = name;
		this.size = size;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "ProductB{" +
				"name='" + name + '\'' +
				", size=" + size +
				", inventory=" + inventory +
				'}';
	}
}
