package org.example.creational.builder;

public interface Builder<M, P> {
	M name(String name);
	M size(int size);
	M inventory(int inventory);
	P build();
}
