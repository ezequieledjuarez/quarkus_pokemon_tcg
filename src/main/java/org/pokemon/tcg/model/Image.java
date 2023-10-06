package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Image implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3543547947259495547L;

	private String symbol;
	private String logo;
	private String small;
	private String large;
	public Image() {
		super();
	}
	public Image(String small, String large, String symbol, String logo) {
		this.small = small;
		this.large = large;
		this.symbol = symbol;
		this.logo = logo;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getSmall() {
		return small;
	}

	public void setSmall(String small) {
		this.small = small;
	}

	public String getLarge() {
		return large;
	}

	public void setLarge(String large) {
		this.large = large;
	}

}
