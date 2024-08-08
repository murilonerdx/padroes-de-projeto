package org.example.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Hammer implements Weapon {

	private final Enchantment enchantment;

	@Override
	public void wield() {
		log.info("The hammer is wielded.");
		enchantment.onActivate();
	}

	@Override
	public void swing() {
		log.info("The hammer is swung.");
		enchantment.apply();
	}

	@Override
	public void unwield() {
		log.info("The hammer is unwielded.");
		enchantment.onDeactivate();
	}

	@Override
	public Enchantment getEnchantment() {
		return enchantment;
	}
}
