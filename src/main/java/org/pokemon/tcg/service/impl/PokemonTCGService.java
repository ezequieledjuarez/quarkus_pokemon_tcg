package org.pokemon.tcg.service.impl;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.pokemon.tcg.model.TCGReponseData;
import org.pokemon.tcg.model.TCGReponseDataList;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri="https://api.pokemontcg.io/v2/cards")
@ClientHeaderParam(name = "X-Api-Key", value = "${x-api-key}")
public interface PokemonTCGService{

	@GET  
	@Produces(MediaType.APPLICATION_JSON)
	public TCGReponseDataList getAllPokemon();

	
	@GET  
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{idCard}")
	public TCGReponseData getPokemonById(@PathParam(value = "idCard") String idCard);

	@GET  
	@Produces(MediaType.APPLICATION_JSON)
	public TCGReponseDataList getPokemonByQuery(@QueryParam("q") String name);
	

}
