package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Weakness implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5746084535050848163L;
	private String type;
	private String value;

	public Weakness() {
		super();
	}
	public Weakness(String type, String value) {
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return this.type;
	}

	public String getValue() {
		return this.value;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
