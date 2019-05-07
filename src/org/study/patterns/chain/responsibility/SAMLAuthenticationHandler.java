package org.study.patterns.chain.responsibility;

public class SAMLAuthenticationHandler extends AuthenticationHandler {

	public SAMLAuthenticationHandler(AuthenticationHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	boolean isAuthenticated(AuthenticationProvider authProvider) {
		System.out.println("In SAML Handler");
		if(authProvider instanceof SAMLAssertionProvider)
			return true;
		else if (this.nextHandler != null)
			return this.nextHandler.isAuthenticated(authProvider);
		return false;
	}

}
