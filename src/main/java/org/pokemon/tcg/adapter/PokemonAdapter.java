package org.pokemon.tcg.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.pokemon.tcg.model.SetsApi;
import org.pokemon.tcg.model.TCG;
import org.pokemon.tcg.model.TCGReponseDataList;
import org.pokemon.tcg.model.TCGResponseApi;
import org.pokemon.tcg.model.TCGResponseApiData;
import org.pokemon.tcg.model.Type;
import org.pokemon.tcg.model.TypesData;

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
				esCartaRepetida = true;
			} else {
				i++;
			}

		}
		return esCartaRepetida;
	}
	
	public static TCGResponseApiData responsePokemonTypes(TypesData types) {
		
		TCGResponseApiData tcgResponseApiData = new TCGResponseApiData();
		
		List<String> typesService = types.getTypes();
		List<Type> typesApi = tcgResponseApiData.getTypes();
		
		for (String type : typesService) {
			String path = "/assets/images/card_types/".concat(type.toLowerCase().concat(".png"));
			
			System.out.println(path);
			Type typeApi = new Type(type, path);
			typesApi.add(typeApi);
		}
		
		tcgResponseApiData.setTypes(typesApi);
		return tcgResponseApiData;
	}

	public static TCGResponseApiData adaptSets(TCGReponseDataList setsServices) {
		List<TCG> setsServicesData = setsServices.getData();
		TCGResponseApiData apiData = new TCGResponseApiData();
		List<SetsApi> setsApiData = new ArrayList<>();
		
		for (TCG tcg : setsServicesData) {
			SetsApi setsApi = new SetsApi(tcg.getName(),tcg.getImages().getSymbol(),tcg.getImages().getLogo(), tcg.getId()); 
			
			setsApiData.add(setsApi);
		}
		
		apiData.setSets(setsApiData);
		return apiData;
	}
}

