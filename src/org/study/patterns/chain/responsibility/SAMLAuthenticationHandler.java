package org.study.patterns.chain.responsibility;

public class SAMLAuthenticationHandler extends AuthenticationHandler {

	public SAMLAuthenticationHandler(AuthenticationHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	boolean isAuthenticated(AuthenticationProvider authProvider) {
		return false;
	}

}
