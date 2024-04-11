package org.example.creational.builder;

public class Director {
	public void constructProduct(Builder builder){
		builder.name("Product A");
		builder.size(10);
	}
}
