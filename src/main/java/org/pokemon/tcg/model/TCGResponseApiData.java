package org.pokemon.tcg.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TCGResponseApiData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3652831842837907433L;
	private List<TCGResponseApi> data;

	private List<String> types;
	
	public List<TCGResponseApi> getData() {
		return data;
	}

	public TCGResponseApiData(List<TCGResponseApi> data) {
		super();
		this.data = data;
	}

	public TCGResponseApiData() {
		
	}

	public void setData(List<TCGResponseApi> data) {
		this.data = data;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

}
