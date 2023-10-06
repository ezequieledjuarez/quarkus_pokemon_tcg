package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Normal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6941813124358536164L;
	private Double low;
	private Double mid;
	private Double high;
	private Double market;
	private Double directLow;
	public Normal() {
		super();
	}
	public Normal(Double low, Double mid, Double high, Double market, Double directLow) {
		this.low = low;
		this.mid = mid;
		this.high = high;
		this.market = market;
		this.directLow = directLow;
	}

	public Double getLow() {
		return this.low;
	}

	public Double getMid() {
		return this.mid;
	}

	public Double getHigh() {
		return this.high;
	}

	public Double getMarket() {
		return this.market;
	}

	public Double getDirectLow() {
		return this.directLow;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public void setMid(Double mid) {
		this.mid = mid;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public void setMarket(Double market) {
		this.market = market;
	}

	public void setDirectLow(Double directLow) {
		this.directLow = directLow;
	}
}
