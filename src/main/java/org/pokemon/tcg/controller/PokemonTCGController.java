package org.pokemon.tcg.controller;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.pokemon.tcg.model.TCGReponseData;
import org.pokemon.tcg.model.TCGReponseDataList;
import org.pokemon.tcg.service.impl.PokemonTCGService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
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

		return pokemonTCGService.getAllPokemon();
	}
	
	@GET
	@Path("/obtener")
	@Produces(MediaType.APPLICATION_JSON)
	public TCGReponseData getPokemonById(@QueryParam("id") String id ) {

		return pokemonTCGService.getPokemonById(id);
	}
	
	@GET
	@Path("/obtener_pokemon")
	@Produces(MediaType.APPLICATION_JSON)
	public TCGReponseDataList getPokemonByName(@QueryParam("name") String name ) {
		
		StringBuilder queryValueName = new StringBuilder().append("name:").append(name); 
		
		return pokemonTCGService.getPokemonByQuery(queryValueName.toString());
	}
}
