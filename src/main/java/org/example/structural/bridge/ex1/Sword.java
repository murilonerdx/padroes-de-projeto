package org.example.structural.bridge.ex1;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@AllArgsConstructor
public class Sword implements Weapon {

	private final Enchantment enchantment;

	@Override
	public void wield() {
		log.info("The sword is wielded.");
		enchantment.onActivate();
	}

	@Override
	public void swing() {
		log.info("The sword is swung.");
		enchantment.apply();
	}

	@Override
	public void unwield() {
		log.info("The sword is unwielded.");
		enchantment.onDeactivate();
	}

	@Override
	public Enchantment getEnchantment() {
		return enchantment;
	}
}
