package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Legalities implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5996075478735370697L;

	private String unlimited;
	private String standard;
	private String expanded;
	public Legalities() {
		super();
	}
	public Legalities(String unlimited, String standard, String expanded) {
		this.unlimited = unlimited;
		this.standard = standard;
		this.expanded = expanded;
	}

	public String getUnlimited() {
		return this.unlimited;
	}

	public String getStandard() {
		return this.standard;
	}

	public String getExpanded() {
		return this.expanded;
	}

	public void setUnlimited(String unlimited) {
		this.unlimited = unlimited;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public void setExpanded(String expanded) {
		this.expanded = expanded;
	}
}
