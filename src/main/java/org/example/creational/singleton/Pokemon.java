package org.example.creational.singleton;

public class Pokemon {
	private static final String pokemon = "pikachu";

	public Pokemon() {
	}

	private static final Pokemon INSTANCE = new Pokemon();

	public static Pokemon getInstance(){
		return INSTANCE;
	}

	@Override
	public String toString() {
		return pokemon;
	}
}
