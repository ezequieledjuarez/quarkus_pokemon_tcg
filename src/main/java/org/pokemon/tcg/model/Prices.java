package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Prices implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6023847578262963488L;

	private Normal normal;
	private ReverseHolofoil reverseHolofoil;
	private Double averageSellPrice;
	private Double lowPrice;
	private Double trendPrice;
	private Double germanProLow;
	private Double suggestedPrice;
	private Double reverseHoloSell;
	private Double reverseHoloLow;
	private Double reverseHoloTrend;
	private Double lowPriceExPlus;
	private Double avg1;
	private Double avg7;
	private Double avg30;
	private Double reverseHoloAvg1;
	private Double reverseHoloAvg7;
	private Double reverseHoloAvg30;

	public Prices() {
		super();
	}
	public Prices(Normal normal, ReverseHolofoil reverseHolofoil, Double averageSellPrice, Double lowPrice,
			Double trendPrice, Double germanProLow, Double suggestedPrice, Double reverseHoloSell,
			Double reverseHoloLow, Double reverseHoloTrend, Double lowPriceExPlus, Double avg1, Double avg7,
			Double avg30, Double reverseHoloAvg1, Double reverseHoloAvg7, Double reverseHoloAvg30) {
		super();
		this.normal = normal;
		this.reverseHolofoil = reverseHolofoil;
		this.averageSellPrice = averageSellPrice;
		this.lowPrice = lowPrice;
		this.trendPrice = trendPrice;
		this.germanProLow = germanProLow;
		this.suggestedPrice = suggestedPrice;
		this.reverseHoloSell = reverseHoloSell;
		this.reverseHoloLow = reverseHoloLow;
		this.reverseHoloTrend = reverseHoloTrend;
		this.lowPriceExPlus = lowPriceExPlus;
		this.avg1 = avg1;
		this.avg7 = avg7;
		this.avg30 = avg30;
		this.reverseHoloAvg1 = reverseHoloAvg1;
		this.reverseHoloAvg7 = reverseHoloAvg7;
		this.reverseHoloAvg30 = reverseHoloAvg30;
	}

	public Double getAverageSellPrice() {
		return this.averageSellPrice;
	}

	public Double getLowPrice() {
		return this.lowPrice;
	}

	public Double getTrendPrice() {
		return this.trendPrice;
	}

	public Double getGermanProLow() {
		return this.germanProLow;
	}

	public Double getSuggestedPrice() {
		return this.suggestedPrice;
	}

	public Double getReverseHoloSell() {
		return this.reverseHoloSell;
	}

	public Double getReverseHoloLow() {
		return this.reverseHoloLow;
	}

	public Double getReverseHoloTrend() {
		return this.reverseHoloTrend;
	}

	public Double getLowPriceExPlus() {
		return this.lowPriceExPlus;
	}

	public Double getAvg1() {
		return this.avg1;
	}

	public Double getAvg7() {
		return this.avg7;
	}

	public Double getAvg30() {
		return this.avg30;
	}

	public Double getReverseHoloAvg1() {
		return this.reverseHoloAvg1;
	}

	public Double getReverseHoloAvg7() {
		return this.reverseHoloAvg7;
	}

	public Double getReverseHoloAvg30() {
		return this.reverseHoloAvg30;
	}

	public void setAverageSellPrice(Double averageSellPrice) {
		this.averageSellPrice = averageSellPrice;
	}

	public void setLowPrice(Double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public void setTrendPrice(Double trendPrice) {
		this.trendPrice = trendPrice;
	}

	public void setGermanProLow(Double germanProLow) {
		this.germanProLow = germanProLow;
	}

	public void setSuggestedPrice(Double suggestedPrice) {
		this.suggestedPrice = suggestedPrice;
	}

	public void setReverseHoloSell(Double reverseHoloSell) {
		this.reverseHoloSell = reverseHoloSell;
	}

	public void setReverseHoloLow(Double reverseHoloLow) {
		this.reverseHoloLow = reverseHoloLow;
	}

	public void setReverseHoloTrend(Double reverseHoloTrend) {
		this.reverseHoloTrend = reverseHoloTrend;
	}

	public void setLowPriceExPlus(Double lowPriceExPlus) {
		this.lowPriceExPlus = lowPriceExPlus;
	}

	public void setAvg1(Double avg1) {
		this.avg1 = avg1;
	}

	public void setAvg7(Double avg7) {
		this.avg7 = avg7;
	}

	public void setAvg30(Double avg30) {
		this.avg30 = avg30;
	}

	public void setReverseHoloAvg1(Double reverseHoloAvg1) {
		this.reverseHoloAvg1 = reverseHoloAvg1;
	}

	public void setReverseHoloAvg7(Double reverseHoloAvg7) {
		this.reverseHoloAvg7 = reverseHoloAvg7;
	}

	public void setReverseHoloAvg30(Double reverseHoloAvg30) {
		this.reverseHoloAvg30 = reverseHoloAvg30;
	}

	public Prices(Normal normal, ReverseHolofoil reverseHolofoil) {
		this.normal = normal;
		this.reverseHolofoil = reverseHolofoil;
	}

	public Normal getNormal() {
		return this.normal;
	}

	public ReverseHolofoil getReverseHolofoil() {
		return this.reverseHolofoil;
	}

	public void setNormal(Normal normal) {
		this.normal = normal;
	}

	public void setReverseHolofoil(ReverseHolofoil reverseHolofoil) {
		this.reverseHolofoil = reverseHolofoil;
	}
}
