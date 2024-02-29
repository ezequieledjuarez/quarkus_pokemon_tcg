package org.pokemon.tcg.jwt.service.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import io.smallrye.jwt.build.Jwt;
import jakarta.inject.Singleton;

@Singleton
public class PokemonTcgJwtServiceImpl {

	public String generateJwt() {
		Set<String> roles = new HashSet<>(
				Arrays.asList("user"));
		
		return Jwt.issuer("pokemon-tcg-jwt")
			.subject("pokemon-tcg-jwt")
			.groups(roles)
			.expiresAt(System.currentTimeMillis()+3600)
			.sign();
	}
}
