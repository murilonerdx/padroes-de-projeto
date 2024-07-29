package org.example.structural.adapter.ex1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class Captain {

	private RowingBoat rowingBoat;

	public void row() {
		rowingBoat.row();
	}

}
