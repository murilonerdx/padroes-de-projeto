package org.example.creational.prototype;

public class HeroFactoryImpl implements HeroFactory {

	private final Mage mage;
	private final Warlord warlord;
	private final Beast beast;

	public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {
		this.mage = mage;
		this.warlord = warlord;
		this.beast = beast;
	}

	/**
	 * Create mage.
	 */
	public Mage createMage() throws CloneNotSupportedException {
		return mage.copy();
	}

	/**
	 * Create warlord.
	 */
	public Warlord createWarlord() throws CloneNotSupportedException {
		return warlord.copy();
	}

	/**
	 * Create beast.
	 */
	public Beast createBeast() throws CloneNotSupportedException {
		return beast.copy();
	}

}
