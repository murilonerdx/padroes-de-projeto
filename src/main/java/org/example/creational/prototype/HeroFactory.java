package org.example.creational.prototype;

public interface HeroFactory {
	Mage createMage() throws CloneNotSupportedException;

	Warlord createWarlord() throws CloneNotSupportedException;

	Beast createBeast() throws CloneNotSupportedException;
}
