package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.creational.abstractfactory.AbstractProduct;
import org.example.creational.abstractfactory.Application;
import org.example.creational.abstractfactory.ConcretProduct;
import org.example.creational.builder.*;
import org.example.creational.factory.Coin;
import org.example.creational.factory.CoinFactory;
import org.example.creational.factory.CoinType;
import org.example.creational.factorymethod.ConcreteCreator1_;
import org.example.creational.factorymethod.ConcreteCreator2_;
import org.example.creational.factorymethod.Creator_;
import org.example.creational.prototype.*;
import org.example.creational.singleton.Pokemon;
import org.example.structural.adapter.ex1.Captain;
import org.example.structural.adapter.ex1.FishingBoatAdapter;
import org.example.structural.adapter.ex2.CardSSDAdapter;
import org.example.structural.adapter.ex2.Notebook;
import org.example.structural.bridge.FlyingEnchantment;
import org.example.structural.bridge.Hammer;
import org.example.structural.bridge.SoulEatingEnchantment;
import org.example.structural.bridge.Sword;
import org.example.structural.composite.Messenger;

/**
 * Hello world!
 */
@Slf4j
public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		// Abstract Factory
		AbstractProduct abstractProduct = new ConcretProduct();
		Application app = new Application(abstractProduct);
		app.print();

		// Builder
		Director director = new Director();
		Builder<ProductBuilder, Product> productBuilder = new ProductBuilder();
		director.constructProduct(productBuilder);
		System.out.println(productBuilder.build());

		Builder<ProductBBuilder, ProductB> productBBuilder = new ProductBBuilder();
		director.constructProductB(productBBuilder);
		ProductB build = productBBuilder.name("Murilo P.S").size(5).inventory(10).build();
		System.out.println(build);


		// Factory
		Coin coin1 = CoinFactory.getCoin(CoinType.COPPER);
		Coin coin = CoinFactory.getCoin(CoinType.GOLD);

		System.out.println(coin.getMarket(20.00));
		System.out.println(coin1.getMarket(20.00));


		// Factory method
		Creator_ creator1 = new ConcreteCreator1_();
		creator1.someOperation();

		Creator_ creator2 = new ConcreteCreator2_();
		creator2.someOperation();


		// Prototype
		HeroFactoryImpl factory = new HeroFactoryImpl(
				new ElfMage("cooking"),
				new ElfWarlord("cleaning"),
				new ElfBeast("protecting")
		);

		Mage mage = factory.createMage();
		Warlord warlord = factory.createWarlord();
		Beast beast = factory.createBeast();

		System.out.println(mage.toString());
		System.out.println(warlord.toString());
		System.out.println(beast.toString());

		// Singleton
		Pokemon pokemon = Pokemon.getInstance();
		System.out.println(pokemon.toString());


		// Adapter
		Captain caption = new Captain(new FishingBoatAdapter());
		caption.row();

		Notebook notebook = new Notebook(new CardSSDAdapter());
		notebook.connectCardSSD();


		//Bridge
		Sword enchantedSword = new Sword(new SoulEatingEnchantment());
		enchantedSword.wield();
		enchantedSword.swing();
		enchantedSword.unwield();


		Hammer hammer = new Hammer(new FlyingEnchantment());
		hammer.wield();
		hammer.swing();
		hammer.unwield();

		//Composite

		Messenger messenger = new Messenger();

		log.info("Message from the orcs: ");
		messenger.messageFromOrcs().print();

		log.info("Message from the elves: ");
		messenger.messageFromElves().print();
	}

}
