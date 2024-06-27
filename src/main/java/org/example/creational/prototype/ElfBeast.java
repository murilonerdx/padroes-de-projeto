package org.example.creational.prototype;

public class ElfBeast extends Beast{
	private final String helpType;

	public ElfBeast(String helpType) {
		super(helpType);
		this.helpType = helpType;
	}
	@Override
	public String toString() {
		return "Elven beast helps in " + helpType;
	}

}
