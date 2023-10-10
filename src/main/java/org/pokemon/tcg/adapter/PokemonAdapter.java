package org.pokemon.tcg.adapter;

import java.util.ArrayList;
import java.util.List;

import org.pokemon.tcg.model.TCG;
import org.pokemon.tcg.model.TCGReponseDataList;
import org.pokemon.tcg.model.TCGResponseApi;
import org.pokemon.tcg.model.TCGResponseApiData;

public class PokemonAdapter {

	public static TCGResponseApiData responseGetAllApi(TCGReponseDataList responseService) {
		List<TCG> pokemonList = responseService.getData();
		List<TCGResponseApi> listApiPokemon = new ArrayList<>();
		

		for (TCG pokemonService : pokemonList) {
			TCGResponseApi responseApiPokemon = new TCGResponseApi(
					pokemonService.getName(),
					pokemonService.getImages().getLarge(), 
					pokemonService.getNumber(), 
					pokemonService.getFlavorText());
			
			listApiPokemon.add(responseApiPokemon);
		}

		return new TCGResponseApiData(listApiPokemon);
	}
}
