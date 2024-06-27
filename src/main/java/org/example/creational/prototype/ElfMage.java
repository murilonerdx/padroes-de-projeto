package org.example.creational.prototype;

public class ElfMage extends Mage{

	private final String helpType;

	public ElfMage(String helpType) {
		super(helpType);
		this.helpType = helpType;
	}

	@Override
	public String toString() {
		return "Elven mage helps in " + helpType;
	}
}
