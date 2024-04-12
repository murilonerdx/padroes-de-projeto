package org.example;

import org.example.creational.abstractfactory.AbstractProduct;
import org.example.creational.abstractfactory.Application;
import org.example.creational.abstractfactory.ConcretProduct;
import org.example.creational.builder.*;
import org.example.creational.factory.Coin;
import org.example.creational.factory.CoinFactory;
import org.example.creational.factory.CoinType;

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


		// Factory
		Coin coin1 = CoinFactory.getCoin(CoinType.COPPER);
		Coin coin = CoinFactory.getCoin(CoinType.GOLD);

		System.out.println(coin.getMarket(20.00));
		System.out.println(coin1.getMarket(20.00));
	}
}
