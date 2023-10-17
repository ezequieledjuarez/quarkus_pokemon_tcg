package org.pokemon.tcg.model;

public class SetsApi {

	private String name;
	private String symbol;
	private String logo;
	private String id;
	
	public SetsApi(String name, String symbol, String logo, String id) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.logo = logo;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
