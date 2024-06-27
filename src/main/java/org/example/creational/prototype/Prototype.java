package org.example.creational.prototype;

public abstract class Prototype<T> implements Cloneable {
	public T copy() throws CloneNotSupportedException {
		return (T) super.clone();
	}
}
