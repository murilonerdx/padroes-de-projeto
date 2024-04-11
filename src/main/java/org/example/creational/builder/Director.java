package org.example.creational.builder;

public class Director {
	public void constructProduct(Builder builder){
		builder.name("Product A");
		builder.size(10);
	}

	public void constructProductB(Builder builder){
		builder.name("Product B");
		builder.size(10);
		builder.inventory(20);
	}
}
