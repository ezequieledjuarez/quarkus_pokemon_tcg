package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TCGReponseData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8065363266781785402L;
	private TCG data;

	public TCGReponseData(TCG data) {
		super();
		this.data = data;
	}

	public TCGReponseData() {
		super();
	}

	public TCG getData() {
		return data;
	}

	public void setData(TCG data) {
		this.data = data;
	}
	
	
}
