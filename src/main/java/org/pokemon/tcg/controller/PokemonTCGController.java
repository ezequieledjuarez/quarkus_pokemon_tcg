package org.pokemon.tcg.controller;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.pokemon.tcg.model.TCGReponseDataList;
import org.pokemon.tcg.service.impl.PokemonTCGService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pokemon/tcg/v1")
public class PokemonTCGController {

	@Inject
	@RestClient
	PokemonTCGService pokemonTCGService;
	
	@GET
	@Path("/obtener_todos")
	@Produces(MediaType.APPLICATION_JSON)
	public TCGReponseDataList getPokemonById() {

		return pokemonTCGService.getPokemonById();
	}
	
}
