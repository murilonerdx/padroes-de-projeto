package org.example.structural.decorator;

public class CoberturaChocolate extends BoloDecorator {
	public CoberturaChocolate(Bolo bolo) {
		super(bolo);
	}

	@Override
	public String fazer() {
		return super.fazer() + " com Cobertura de Chocolate";
	}
}
