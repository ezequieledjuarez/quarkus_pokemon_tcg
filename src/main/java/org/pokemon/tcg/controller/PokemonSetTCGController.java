package org.pokemon.tcg.controller;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.pokemon.tcg.adapter.PokemonAdapter;
import org.pokemon.tcg.model.SetsApi;
import org.pokemon.tcg.model.TCGReponseDataList;
import org.pokemon.tcg.model.TCGResponseApiData;
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
	public List<SetsApi> getSets() {
		TCGReponseDataList setsServices = pokemonSetTCGService.getSets();
		return PokemonAdapter.adaptSets(setsServices).getSets();

	}
}
