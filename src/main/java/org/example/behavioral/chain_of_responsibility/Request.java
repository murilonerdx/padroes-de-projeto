package org.example.behavioral.chain_of_responsibility;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Request {

	/**
	 * The type of this request, used by each item in the chain to see if they should or can handle
	 * this particular request.
	 */
	private final RequestType requestType;


	private final String requestDescription;

	private boolean handled;


	public Request(final RequestType requestType, final String requestDescription) {
		this.requestType = Objects.requireNonNull(requestType);
		this.requestDescription = Objects.requireNonNull(requestDescription);
	}

	public void markHandled() {
		this.handled = true;
	}

	@Override
	public String toString() {
		return getRequestDescription();
	}

}
