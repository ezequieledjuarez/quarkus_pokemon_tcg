package org.pokemon.tcg.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class TCG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7140881925272958436L;

	private String id;
	private String name;
	private String supertype;
	private List<String> subtypes;
	private String hp;
	private List<String> types;
	private String evolvesFrom;
	private List<Ability> abilities;
	private List<Attack> attacks;
	private List<Weakness> weaknesses;
	private List<String> retreatCost;
	private Long convertedRetreatCost;
	private Set set;
	private String number;
	private String artist;
	private String rarity;
	private String flavorText;
	private List<Long> nationalPokedexNumbers;
	private Legalities legalities;
	private Image images;
	private Tcgplayer tcgplayer;
	private Cardmarket cardmarket;

	public TCG(String id, String name, String supertype, List<String> subtypes, String hp, List<String> types,
			String evolvesFrom, List<Ability> abilities, List<Attack> attacks, List<Weakness> weaknesses,
			List<String> retreatCost, Long convertedRetreatCost, Set set, String number, String artist, String rarity,
			String flavorText, List<Long> nationalPokedexNumbers, Legalities legalities, Image images,
			Tcgplayer tcgplayer, Cardmarket cardmarket) {
		super();
		this.id = id;
		this.name = name;
		this.supertype = supertype;
		this.subtypes = subtypes;
		this.hp = hp;
		this.types = types;
		this.evolvesFrom = evolvesFrom;
		this.abilities = abilities;
		this.attacks = attacks;
		this.weaknesses = weaknesses;
		this.retreatCost = retreatCost;
		this.convertedRetreatCost = convertedRetreatCost;
		this.set = set;
		this.number = number;
		this.artist = artist;
		this.rarity = rarity;
		this.flavorText = flavorText;
		this.nationalPokedexNumbers = nationalPokedexNumbers;
		this.legalities = legalities;
		this.images = images;
		this.tcgplayer = tcgplayer;
		this.cardmarket = cardmarket;
	}

	public TCG() {
		super();
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getSupertype() {
		return this.supertype;
	}

	public List<String> getSubtypes() {
		return this.subtypes;
	}

	public String getHp() {
		return this.hp;
	}

	public List<String> getTypes() {
		return this.types;
	}

	public String getEvolvesFrom() {
		return this.evolvesFrom;
	}

	public List<Ability> getAbilities() {
		return this.abilities;
	}

	public List<Attack> getAttacks() {
		return this.attacks;
	}

	public List<Weakness> getWeaknesses() {
		return this.weaknesses;
	}

	public List<String> getRetreatCost() {
		return this.retreatCost;
	}

	public Long getConvertedRetreatCost() {
		return this.convertedRetreatCost;
	}

	public Set getSet() {
		return this.set;
	}

	public String getNumber() {
		return this.number;
	}

	public String getArtist() {
		return this.artist;
	}

	public String getRarity() {
		return this.rarity;
	}

	public String getFlavorText() {
		return this.flavorText;
	}

	public List<Long> getNationalPokedexNumbers() {
		return this.nationalPokedexNumbers;
	}

	public Legalities getLegalities() {
		return this.legalities;
	}

	public Image getImages() {
		return this.images;
	}

	public Tcgplayer getTcgplayer() {
		return this.tcgplayer;
	}

	public Cardmarket getCardmarket() {
		return this.cardmarket;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSupertype(String supertype) {
		this.supertype = supertype;
	}

	public void setSubtypes(List<String> subtypes) {
		this.subtypes = subtypes;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public void setEvolvesFrom(String evolvesFrom) {
		this.evolvesFrom = evolvesFrom;
	}

	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}

	public void setAttacks(List<Attack> attacks) {
		this.attacks = attacks;
	}

	public void setWeaknesses(List<Weakness> weaknesses) {
		this.weaknesses = weaknesses;
	}

	public void setRetreatCost(List<String> retreatCost) {
		this.retreatCost = retreatCost;
	}

	public void setConvertedRetreatCost(Long convertedRetreatCost) {
		this.convertedRetreatCost = convertedRetreatCost;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	public void setNationalPokedexNumbers(List<Long> nationalPokedexNumbers) {
		this.nationalPokedexNumbers = nationalPokedexNumbers;
	}

	public void setLegalities(Legalities legalities) {
		this.legalities = legalities;
	}

	public void setImages(Image images) {
		this.images = images;
	}

	public void setTcgplayer(Tcgplayer tcgplayer) {
		this.tcgplayer = tcgplayer;
	}

	public void setCardmarket(Cardmarket cardmarket) {
		this.cardmarket = cardmarket;
	}
}
