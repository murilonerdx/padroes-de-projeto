package org.example.behavioral.chain_of_responsibility;

public interface RequestHandler {

	boolean canHandleRequest(Request req);

	int getPriority();

	void handle(Request req);

	String name();
}
