package org.example.structural.composite.ex2;

import java.util.ArrayList;
import java.util.List;

public class ParedeDeBlocos implements Bloco{
	private List<Bloco> blocos = new ArrayList<>();

	public void adicionarBloco(Bloco bloco) {
		blocos.add(bloco);
	}

	@Override
	public void construir() {
		for (Bloco bloco : blocos) {
			bloco.construir();
		}
		System.out.println("Parede completa.");
	}
}
