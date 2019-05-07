package org.study.patterns.chain.responsibility;

public abstract class AuthenticationHandler {
	
	AuthenticationHandler nextHandler;
	
	public AuthenticationHandler(AuthenticationHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	abstract boolean isAuthenticated(AuthenticationProvider authProvider);

}
