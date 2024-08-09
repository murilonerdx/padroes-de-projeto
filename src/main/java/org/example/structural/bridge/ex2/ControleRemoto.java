package org.example.structural.bridge.ex2;

public abstract class ControleRemoto {
	public abstract void ligarDesligar();

	protected Dispositivo dispositivo;

	protected ControleRemoto(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

}
