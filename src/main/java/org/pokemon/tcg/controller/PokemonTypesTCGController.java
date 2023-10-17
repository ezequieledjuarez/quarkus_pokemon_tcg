package org.pokemon.tcg.controller;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.pokemon.tcg.adapter.PokemonAdapter;
import org.pokemon.tcg.model.Type;
import org.pokemon.tcg.model.TypesData;
import org.pokemon.tcg.service.impl.PokemonTypesTCGService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pokemon/tcg/v1/types")
public class PokemonTypesTCGController {

	@Inject
	@RestClient
	PokemonTypesTCGService pokemonTypesTCGService;


	@GET
	@Path("/obtener_todos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Type> getTypes() {
		TypesData servicePokemonTypes = pokemonTypesTCGService.getTypes();
		return PokemonAdapter.responsePokemonTypes(servicePokemonTypes).getTypes();

	}
}
