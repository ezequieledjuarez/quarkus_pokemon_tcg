package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_DEFAULT)
public class TCGResponseApi implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4039289173330322588L;

	@JsonProperty("pokemonName")
	private String pokemonName;

	@JsonProperty("pokemonImage")
	private String pokemonImage;

	@JsonProperty("pokemonNumber")
	private String pokemonNumber;

	@JsonProperty("pokemonDescription")
	private String pokemonDescription;

	@JsonProperty("pokemonId")
	private String pokemonId;

	public TCGResponseApi(String pokemonName, String pokemonImage, String pokemonNumber, String pokemonDescription, String pokemonId) {
		super();
		this.pokemonName = pokemonName;
		this.pokemonImage = pokemonImage;
		this.pokemonNumber = pokemonNumber;
		this.pokemonDescription = pokemonDescription;
		this.pokemonId = pokemonId;
	}
	
	public String getPokemonName() {
		return pokemonName;
	}

	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}

	public String getPokemonImage() {
		return pokemonImage;
	}

	public void setPokemonImage(String pokemonImage) {
		this.pokemonImage = pokemonImage;
	}

	public String getPokemonNumber() {
		return pokemonNumber;
	}

	public void setPokemonNumber(String pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}

	public String getPokemonDescription() {
		return pokemonDescription;
	}

	public void setPokemonDescription(String pokemonDescription) {
		this.pokemonDescription = pokemonDescription;
	}

	
	public String getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(String pokemonId) {
		this.pokemonId = pokemonId;
	}
	
	@Override
	public String toString() {
		return "TCGResponseApi [pokemonName=" + pokemonName + ", pokemonImage=" + pokemonImage + ", pokemonNumber="
				+ pokemonNumber + ", pokemonDescription=" + pokemonDescription + "]";
	}

}
