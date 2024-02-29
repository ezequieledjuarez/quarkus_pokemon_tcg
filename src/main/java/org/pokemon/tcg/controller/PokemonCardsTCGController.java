package org.pokemon.tcg.controller;

import java.util.List;
import org.eclipse.microprofile.openapi.annotations.enums.SecuritySchemeType;
import org.eclipse.microprofile.openapi.annotations.security.SecurityScheme;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.pokemon.tcg.adapter.PokemonAdapter;
import org.pokemon.tcg.model.TCGReponseData;
import org.pokemon.tcg.model.TCGReponseDataList;
import org.pokemon.tcg.model.TCGResponseApi;
import org.pokemon.tcg.model.TCGResponseApiDetail;
import org.pokemon.tcg.service.impl.PokemonCardsTCGService;

import io.quarkus.logging.Log;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/pokemon/tcg/v1/cards")
@SecurityScheme(scheme = "bearer", type = SecuritySchemeType.HTTP, bearerFormat = "JWT")
public class PokemonCardsTCGController {

	@Inject
	@RestClient
	PokemonCardsTCGService pokemonTCGService;

	@GET
	@PermitAll
	@Path("/obtener_todos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TCGResponseApi> getAllPokemon() {
		Log.info("Se intentará obtener un listado de pokémons");
		TCGReponseDataList pokemonService = pokemonTCGService.getAllPokemon();
		Log.info("Se obtuvo correctamente el listado");
		return PokemonAdapter.responseGetAllApi(pokemonService).getData();
	}

	@GET
	@Path("/obtener_aleatorios")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TCGResponseApi> getPokemonRandom() {
		Log.info("Se intentará obtener un listado aleatorio de pokémons");
		TCGReponseDataList pokemonService = pokemonTCGService.getAllPokemon();
		Log.info("Se obtuvo correctamente el listado");
		return PokemonAdapter.responseGetRandomApi(pokemonService).getData();
	}

	@GET
	@Path("/obtener")
	@Produces(MediaType.APPLICATION_JSON)
	public TCGResponseApiDetail getPokemonById(@QueryParam("id") String id) {
		Log.info("Se intentará obtener la información detallada del pokemon con id: {}" + id);
		TCGReponseData pokemonService = pokemonTCGService.getPokemonById(id);
		Log.info("Se obtuvo correctamente la información de: " + id);
		return PokemonAdapter.responsePokemonDetail(pokemonService);
	}

	@GET
	@Path("/obtener_pokemon")
	@RolesAllowed({ "user" })
	@Produces(MediaType.APPLICATION_JSON)
	public List<TCGResponseApi> getPokemonByName(@QueryParam("query") String name) {

		Log.info("Se intentará obtener la información detallada de: {}" + name);
		String[] datosQuery = name.split(":");
		StringBuilder queryValueName = new StringBuilder().append(datosQuery[0].concat(":")).append(datosQuery[1]);
		TCGReponseDataList pokemonService = pokemonTCGService.getPokemonByQuery(queryValueName.toString());
		Log.info("Se obtuvo correctamente la información de: " + name);
		return PokemonAdapter.responseGetAllApi(pokemonService).getData();

	}

}
