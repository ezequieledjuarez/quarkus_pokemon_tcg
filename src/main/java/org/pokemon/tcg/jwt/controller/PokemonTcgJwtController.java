package org.pokemon.tcg.jwt.controller;

import org.pokemon.tcg.jwt.service.impl.PokemonTcgJwtServiceImpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/jwt")
@ApplicationScoped
public class PokemonTcgJwtController {

	 @Inject
	 PokemonTcgJwtServiceImpl pokemonTcgJwtServiceImpl;
	

	@GET()
	@Produces(MediaType.TEXT_PLAIN)
	public Response PokemonJwtController() {
		String jwt = pokemonTcgJwtServiceImpl.generateJwt();
		return Response.ok(jwt).build();
	}
}
