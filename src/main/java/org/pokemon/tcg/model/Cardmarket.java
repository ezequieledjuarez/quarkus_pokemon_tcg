package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Cardmarket implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3778751485877168717L;

	private String url;
	private String updatedAt;
	private Prices prices;
	public Cardmarket() {
		super();
	}
	public Cardmarket(String url, String updatedAt, Prices prices) {
		this.url = url;
		this.updatedAt = updatedAt;
		this.prices = prices;
	}

	public String getUrl() {
		return this.url;
	}

	public String getUpdatedAt() {
		return this.updatedAt;
	}

	public Prices getPrices() {
		return this.prices;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setPrices(Prices prices) {
		this.prices = prices;
	}
}
