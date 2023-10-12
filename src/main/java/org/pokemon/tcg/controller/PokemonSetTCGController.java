package org.pokemon.tcg.controller;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.pokemon.tcg.model.TCGReponseDataList;
import org.pokemon.tcg.service.impl.PokemonSetTCGService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pokemon/tcg/v1/sets")
public class PokemonSetTCGController {

	@Inject
	@RestClient
	PokemonSetTCGService pokemonSetTCGService;


	@GET
	@Path("/obtener_todos")
	@Produces(MediaType.APPLICATION_JSON)
	public TCGReponseDataList getSets() {
		return pokemonSetTCGService.getSets();

	}
}
