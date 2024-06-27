package org.example.creational.prototype;

public class ElfWarlord extends Warlord{

	private final String helpType;

	public ElfWarlord(String helpType) {
		super(helpType);
		this.helpType = helpType;
	}

	@Override
	public String toString() {
		return "Elven warlord helps in " + helpType;
	}
}
