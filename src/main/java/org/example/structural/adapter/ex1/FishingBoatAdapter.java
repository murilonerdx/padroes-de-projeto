package org.example.structural.adapter.ex1;

public class FishingBoatAdapter implements RowingBoat {

	private final FishingBoat boat = new FishingBoat();

	public final void row() {
		boat.sail();
	}
}
