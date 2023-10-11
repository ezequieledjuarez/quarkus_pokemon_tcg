package org.pokemon.tcg.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.pokemon.tcg.model.TCG;
import org.pokemon.tcg.model.TCGReponseDataList;
import org.pokemon.tcg.model.TCGResponseApi;
import org.pokemon.tcg.model.TCGResponseApiData;

public class PokemonAdapter {

	public static TCGResponseApiData responseGetAllApi(TCGReponseDataList responseService) {
		List<TCG> pokemonList = responseService.getData();
		List<TCGResponseApi> listApiPokemon = new ArrayList<>();

		for (TCG pokemonService : pokemonList) {
			TCGResponseApi responseApiPokemon = new TCGResponseApi(pokemonService.getName(),
					pokemonService.getImages().getLarge(), pokemonService.getNumber(), pokemonService.getFlavorText());

			listApiPokemon.add(responseApiPokemon);
		}

		return new TCGResponseApiData(listApiPokemon);
	}

	public static TCGResponseApiData responseGetRandomApi(TCGReponseDataList responseService) {
		List<TCG> pokemonServiceList = responseService.getData();
		List<TCGResponseApi> listApiPokemon = new ArrayList<>();

		while (listApiPokemon.size() < 18) {
			
			Random random = new Random();
			int randomPokemon = random.nextInt(200);
			
			TCG tcg = pokemonServiceList.get(randomPokemon);
			
			System.out.println("Se intentará agregar el pokemon: " + tcg.getName() + tcg.getId());
			
			if (null != tcg.getFlavorText() && !esCartaRepetida(tcg, listApiPokemon)) {
				TCGResponseApi responseApiPokemon = new TCGResponseApi(pokemonServiceList.get(randomPokemon).getName(),
						pokemonServiceList.get(randomPokemon).getImages().getLarge(),
						pokemonServiceList.get(randomPokemon).getNationalPokedexNumbers().get(0).toString(),
						pokemonServiceList.get(randomPokemon).getFlavorText());
			
					listApiPokemon.add(responseApiPokemon);
			}

		}
		
		return new TCGResponseApiData(listApiPokemon);
	}

	private static boolean esCartaRepetida(TCG cartaParaAgregar, List<TCGResponseApi> listApiPokemon) {
		boolean esCartaRepetida = false;
		int i = 1;

		while (i < listApiPokemon.size() && !esCartaRepetida && !listApiPokemon.isEmpty()) {
			if (listApiPokemon.get(i).getPokemonImage().equals(cartaParaAgregar.getImages().getLarge())) {
				System.out.println("El pokemon ya está agregado");
				esCartaRepetida = true;
			} else {
				i++;
			}

		}
		return esCartaRepetida;
	}
}
