package org.example.structural.composite.ex1;

import java.util.List;


public class Word extends LetterComposite {

	public Word(List<Letter> letters) {
		letters.forEach(this::add);
	}

	public Word(char... letters) {
		for (char letter : letters) {
			this.add(new Letter(letter));
		}
	}

	@Override
	protected void printThisAfter() {
		System.out.print(" ");
	}
}
