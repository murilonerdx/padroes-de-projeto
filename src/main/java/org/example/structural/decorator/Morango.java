package org.example.structural.decorator;

public class Morango extends BoloDecorator {
    public Morango(Bolo bolo) {
		super(bolo);
	}

	@Override
	public String fazer() {
		return super.fazer() + " com Morango";
	}
}
