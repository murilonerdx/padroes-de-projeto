package org.example.structural.bridge.ex2;

public class ControleSimples extends ControleRemoto {
	public ControleSimples(Dispositivo dispositivo) {
		super(dispositivo);
	}

	@Override
	public void ligarDesligar() {
		System.out.println("Controle remoto operando...");
		dispositivo.ligar();
		dispositivo.desligar();
	}
}
