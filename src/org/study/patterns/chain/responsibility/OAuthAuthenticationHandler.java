package org.study.patterns.chain.responsibility;

public class OAuthAuthenticationHandler extends AuthenticationHandler {

	public OAuthAuthenticationHandler(AuthenticationHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	boolean isAuthenticated(AuthenticationProvider authProvider) {
		return false;
	}

}
