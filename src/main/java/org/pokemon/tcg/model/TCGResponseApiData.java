package org.pokemon.tcg.model;

import java.io.Serializable;
import java.util.List;

public class TCGResponseApiData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3652831842837907433L;
	private List<TCGResponseApi> data;

	public List<TCGResponseApi> getData() {
		return data;
	}

	public TCGResponseApiData(List<TCGResponseApi> data) {
		super();
		this.data = data;
	}

	public void setData(List<TCGResponseApi> data) {
		this.data = data;
	}

}
