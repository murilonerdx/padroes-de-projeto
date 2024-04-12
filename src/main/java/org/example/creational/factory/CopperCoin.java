package org.example.creational.factory;

public class CopperCoin implements Coin {

	static final String DESCRIPTION = "This is a copper coin.";
	static final double VALUE_MARKET = 0.08;

	@Override
	public double valueMarket() {
		return VALUE_MARKET;
	}

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

	@Override
	public String getMarket(double valueCoin) {
		return String.format("%s this market value is %.2f", getDescription(), (valueCoin * VALUE_MARKET));
	}


}
