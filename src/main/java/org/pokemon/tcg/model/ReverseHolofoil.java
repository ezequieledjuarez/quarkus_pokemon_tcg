package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class ReverseHolofoil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449257813587140943L;
	private Long low;
	private Double mid;
	private Long high;
	private Double market;
	private Double directLow;
	public ReverseHolofoil() {
		super();
	}
	public ReverseHolofoil(Long low, Double mid, Long high, Double market, Double directLow) {
		this.low = low;
		this.mid = mid;
		this.high = high;
		this.market = market;
		this.directLow = directLow;
	}

	public Long getLow() {
		return this.low;
	}

	public Double getMid() {
		return this.mid;
	}

	public Long getHigh() {
		return this.high;
	}

	public Double getMarket() {
		return this.market;
	}

	public Double getDirectLow() {
		return this.directLow;
	}

	public void setLow(Long low) {
		this.low = low;
	}

	public void setMid(Double mid) {
		this.mid = mid;
	}

	public void setHigh(Long high) {
		this.high = high;
	}

	public void setMarket(Double market) {
		this.market = market;
	}

	public void setDirectLow(Double directLow) {
		this.directLow = directLow;
	}
}
