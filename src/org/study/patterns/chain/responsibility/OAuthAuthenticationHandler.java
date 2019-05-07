package org.study.patterns.chain.responsibility;

public class OAuthAuthenticationHandler extends AuthenticationHandler {

	public OAuthAuthenticationHandler(AuthenticationHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	boolean isAuthenticated(AuthenticationProvider authProvider) {
		System.out.println("In OAuth Handler");
		if(authProvider instanceof OAuthTokenProvider) {
			System.out.println("Returning true from OAuth");
			return true;	
		}
		else if (this.nextHandler != null)
			return this.nextHandler.isAuthenticated(authProvider);
		return false;
	}

}
