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
import org.example.structural.bridge.ex1.FlyingEnchantment;
import org.example.structural.bridge.ex1.Hammer;
import org.example.structural.bridge.ex1.SoulEatingEnchantment;
import org.example.structural.bridge.ex1.Sword;
import org.example.structural.bridge.ex2.*;
import org.example.structural.composite.ex1.Messenger;
import org.example.structural.composite.ex2.Bloco;
import org.example.structural.composite.ex2.BlocoSimples;
import org.example.structural.composite.ex2.ParedeDeBlocos;
import org.example.structural.decorator.Bolo;
import org.example.structural.decorator.BoloSimples;
import org.example.structural.decorator.CoberturaChocolate;
import org.example.structural.decorator.Morango;

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

		Dispositivo tv = new TV();
		Dispositivo radio = new Radio();

		ControleRemoto controle = new ControleSimples(tv);
		controle.ligarDesligar();

		controle = new ControleSimples(radio);
		controle.ligarDesligar();

		//Composite
		Messenger messenger = new Messenger();

		log.info("Message from the orcs: ");
		messenger.messageFromOrcs().print();

		log.info("Message from the elves: ");
		messenger.messageFromElves().print();

		Bloco bloco1 = new BlocoSimples();
		Bloco bloco2 = new BlocoSimples();

		ParedeDeBlocos parede = new ParedeDeBlocos();
		parede.adicionarBloco(bloco1);
		parede.adicionarBloco(bloco2);

		parede.construir();

		//Decorator
		Bolo boloSimples = new BoloSimples();
		System.out.println(boloSimples.fazer());

		Bolo boloComChocolate = new CoberturaChocolate(boloSimples);
		System.out.println(boloComChocolate.fazer());

		Bolo boloCompleto = new Morango(boloComChocolate);
		System.out.println(boloCompleto.fazer());
	}

}
