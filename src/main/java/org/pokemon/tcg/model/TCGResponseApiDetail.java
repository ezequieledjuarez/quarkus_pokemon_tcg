package org.pokemon.tcg.model;

public class TCGResponseApiDetail {

	private String nameSet;
	
	private String seriesSet;
	
	private String releaseDate;
	
	private String symbolSet;
	
	private String imageSet;
	
	private String rarity;
	
	private Long nationalPokedexNumber;
	
	private String name;
	
	private Double averageSellPrice;
	
	private Double lowPrice;
	
	private Double trendPrice;

	private String pokemonImage;
	
	public TCGResponseApiDetail(String nameSet, String seriesSet, String releaseDate, String symbolSet, String imageSet,
			String rarity, Long nationalPokedexNumber, String name, Double averageSellPrice, Double lowPrice,
			Double trendPrice, String pokemonImage) {
		super();
		this.nameSet = nameSet;
		this.seriesSet = seriesSet;
		this.releaseDate = releaseDate;
		this.symbolSet = symbolSet;
		this.imageSet = imageSet;
		this.rarity = rarity;
		this.nationalPokedexNumber = nationalPokedexNumber;
		this.name = name;
		this.averageSellPrice = averageSellPrice;
		this.lowPrice = lowPrice;
		this.trendPrice = trendPrice;
		this.pokemonImage = pokemonImage;
	}

	public String getNameSet() {
		return nameSet;
	}

	public void setNameSet(String nameSet) {
		this.nameSet = nameSet;
	}

	public String getSeriesSet() {
		return seriesSet;
	}

	public void setSeriesSet(String seriesSet) {
		this.seriesSet = seriesSet;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSymbolSet() {
		return symbolSet;
	}

	public void setSymbolSet(String symbolSet) {
		this.symbolSet = symbolSet;
	}

	public String getImageSet() {
		return imageSet;
	}

	public void setImageSet(String imageSet) {
		this.imageSet = imageSet;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public Long getNationalPokedexNumber() {
		return nationalPokedexNumber;
	}

	public void setNationalPokedexNumber(Long nationalPokedexNumber) {
		this.nationalPokedexNumber = nationalPokedexNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAverageSellPrice() {
		return averageSellPrice;
	}

	public void setAverageSellPrice(Double averageSellPrice) {
		this.averageSellPrice = averageSellPrice;
	}

	public Double getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(Double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public Double getTrendPrice() {
		return trendPrice;
	}

	public void setTrendPrice(Double trendPrice) {
		this.trendPrice = trendPrice;
	}

	public String getPokemonImage() {
		return pokemonImage;
	}

	public void setPokemonImage(String pokemonImage) {
		this.pokemonImage = pokemonImage;
	}

}
