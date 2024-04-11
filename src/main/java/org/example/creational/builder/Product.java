package org.example.creational.builder;

public class Product {
	private String name;
	private Integer size;

	public Product(String name, Integer size) {
		this.name = name;
		this.size = size;
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
		return "Product{" +
				"name='" + name + '\'' +
				", size=" + size +
				'}';
	}
}
