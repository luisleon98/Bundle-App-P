package mx.ipn.cenac.dsi.bundles.puebla.service;


import java.net.MalformedURLException;
import java.net.URL;
import java.security.interfaces.RSAPublicKey;

import com.auth0.jwk.Jwk;
import com.auth0.jwk.JwkException;
import com.auth0.jwk.JwkProvider;
import com.auth0.jwk.UrlJwkProvider;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

public class TokenVal {

	private String jwksProvider;

	public void tLocalValidate(String token) throws MalformedURLException, JwkException  {

		DecodedJWT jwt = JWT.decode(token);

		JwkProvider provider = new UrlJwkProvider(new URL(getJwksProvider()));
		Jwk jwk = provider.get(jwt.getKeyId());
		RSAPublicKey publicKey = (RSAPublicKey) jwk.getPublicKey();
		Algorithm algorithm = Algorithm.RSA256(publicKey, null);
		JWTVerifier verifier = JWT.require(algorithm).build();
		DecodedJWT jwtv = verifier.verify(jwt);

	}

	public String getAzp(String token) {
		DecodedJWT jwt = JWT.decode(token);
		// https://www.iana.org/assignments/jwt/jwt.xhtml
		return jwt.getClaim("azp").toString();
	}

	public String getJwksProvider() {
		return jwksProvider;
	}

	public void setJwksProvider(String jwksProvider) {
		this.jwksProvider = jwksProvider;
	}

}
