package org.study.patterns.chain.responsibility;

public class Tester {
	
	private static AuthenticationHandler getResponsibilityChain() {
		AuthenticationHandler authHandler = new OAuthAuthenticationHandler(null);
		return new SAMLAuthenticationHandler(authHandler);
		// So our chain is : SAML --> OAuth
	}
	public static void main(String[] args) {
		AuthenticationProvider provider = new OAuthTokenProvider();
		AuthenticationHandler handler = getResponsibilityChain();
		boolean result = handler.isAuthenticated(provider);
		System.out.println(result);
	}

}
