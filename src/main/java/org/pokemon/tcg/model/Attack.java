package org.pokemon.tcg.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Attack implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6886613075407824104L;
	private String name;
	private List<String> cost;
	private Long convertedEnergyCost;
	private String damage;
	private String text;
	
	public Attack() {
		super();
	}

	public Attack(String name, List<String> cost, Long convertedEnergyCost, String damage, String text) {
		this.name = name;
		this.cost = cost;
		this.convertedEnergyCost = convertedEnergyCost;
		this.damage = damage;
		this.text = text;
	}

	public String getName() {
		return this.name;
	}

	public List<String> getCost() {
		return this.cost;
	}

	public Long getConvertedEnergyCost() {
		return this.convertedEnergyCost;
	}

	public String getDamage() {
		return this.damage;
	}

	public String getText() {
		return this.text;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(List<String> cost) {
		this.cost = cost;
	}

	public void setConvertedEnergyCost(Long convertedEnergyCost) {
		this.convertedEnergyCost = convertedEnergyCost;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}

	public void setText(String text) {
		this.text = text;
	}
}
