package org.example.structural.adapter.ex2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class Notebook {
	private final CardSSD cardSSD;

	public void connectCardSSD() {
		cardSSD.connectCardSSD();
	}
}
