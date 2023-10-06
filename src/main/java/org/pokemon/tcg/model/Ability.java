package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Ability implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6043445711723142462L;
	private String name;
	private String text;
	private String type;

	
	public Ability() {
		super();
	}

	public Ability(String name, String text, String type) {
		this.name = name;
		this.text = text;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public String getText() {
		return this.text;
	}

	public String getType() {
		return this.type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setType(String type) {
		this.type = type;
	}
}