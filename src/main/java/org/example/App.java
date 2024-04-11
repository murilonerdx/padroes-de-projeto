package org.example;

import org.example.creational.abstractfactory.AbstractFactory;
import org.example.creational.abstractfactory.AbstractProduct;
import org.example.creational.abstractfactory.Application;
import org.example.creational.abstractfactory.ConcretProduct;
import org.example.creational.builder.Builder;
import org.example.creational.builder.Director;
import org.example.creational.builder.ProductBBuilder;
import org.example.creational.builder.ProductBuilder;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		// Abstract Factory
		AbstractProduct abstractProduct = new ConcretProduct();
		Application app = new Application(abstractProduct);
		app.print();

		// Builder
		Director director = new Director();
		Builder productBuilder = new ProductBuilder();
		director.constructProduct(productBuilder);
		System.out.println(productBuilder.build());

		Builder productBBuilder = new ProductBBuilder();
		director.constructProductB(productBBuilder);
		System.out.println(productBBuilder.build());
	}
}
