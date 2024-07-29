package org.example.structural.adapter.ex2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class CardSSDAdapter implements CardSSD {
	private SSD ssd = new SSD();

	@Override
	public void connectCardSSD() {
		ssd.connectSSD();
	}
}
