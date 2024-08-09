package org.example.structural.decorator;

public abstract class BoloDecorator implements Bolo {
	protected Bolo bolo;

	public BoloDecorator(Bolo bolo) {
		this.bolo = bolo;
	}

	public String fazer() {
		return bolo.fazer();
	}
}
