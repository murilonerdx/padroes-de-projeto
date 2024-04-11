package org.example.creational.builder;

public interface Builder<T> {
	void name(String name);
	void size(int size);
	int inventory(int inventory);
	T build();
}
