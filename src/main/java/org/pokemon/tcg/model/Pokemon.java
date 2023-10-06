package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Pokemon implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5464217759750243625L;
	protected String name;

	public Pokemon() {
		super();
	}

	public Pokemon(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
