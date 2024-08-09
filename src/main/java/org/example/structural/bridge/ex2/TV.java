package org.example.structural.bridge.ex2;

public class TV implements Dispositivo {
	@Override
	public void ligar() {
		System.out.println("TV ligada!");
	}

	@Override
	public void desligar() {
		System.out.println("TV desligada!");
	}
}
