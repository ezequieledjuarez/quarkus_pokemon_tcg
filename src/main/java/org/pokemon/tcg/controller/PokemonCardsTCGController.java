package org.pokemon.tcg.controller;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.pokemon.tcg.adapter.PokemonAdapter;
import org.pokemon.tcg.model.TCGReponseData;
import org.pokemon.tcg.model.TCGReponseDataList;
import org.pokemon.tcg.model.TCGResponseApi;
import org.pokemon.tcg.service.impl.PokemonCardsTCGService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/pokemon/tcg/v1/cards")
public class PokemonCardsTCGController {

	@Inject
	@RestClient
	PokemonCardsTCGService pokemonTCGService;

	@GET
	@Path("/obtener_todos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TCGResponseApi> getAllPokemon() {
		TCGReponseDataList pokemonService = pokemonTCGService.getAllPokemon();
		return PokemonAdapter.responseGetAllApi(pokemonService).getData();
	}

	@GET
	@Path("/obtener_aleatorios")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TCGResponseApi> getPokemonRandom() {
		TCGReponseDataList pokemonService = pokemonTCGService.getAllPokemon();
		return PokemonAdapter.responseGetRandomApi(pokemonService).getData();
	}

	@GET
	@Path("/obtener")
	@Produces(MediaType.APPLICATION_JSON)
	public TCGReponseData getPokemonById(@QueryParam("id") String id) {

		return pokemonTCGService.getPokemonById(id);
	}

	@GET
	@Path("/obtener_pokemon")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TCGResponseApi> getPokemonByName(@QueryParam("query") String name) {
		
		String[] datosQuery = name.split(":");
		StringBuilder queryValueName = new StringBuilder().append( datosQuery[0].concat(":")).append(datosQuery[1]);
		TCGReponseDataList pokemonService = pokemonTCGService.getPokemonByQuery(queryValueName.toString());
		return PokemonAdapter.responseGetAllApi(pokemonService).getData();

	}

}
