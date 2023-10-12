package org.pokemon.tcg.service.impl;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.pokemon.tcg.model.TCGReponseDataList;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri="https://api.pokemontcg.io/v2/sets")
@ClientHeaderParam(name = "X-Api-Key", value = "${x-api-key}")
public interface PokemonSetTCGService {
	
	@GET  
	@Produces(MediaType.APPLICATION_JSON)
	public TCGReponseDataList getSets();
}
