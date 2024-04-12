package org.example.creational.factory;

public class CoinFactory {
	public static Coin getCoin(CoinType type){
		return type.getConstructor().get();
	}
}
