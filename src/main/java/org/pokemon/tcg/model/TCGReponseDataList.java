package org.pokemon.tcg.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TCGReponseDataList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8065363266781785402L;
	private List<TCG> data;

	public TCGReponseDataList(List<TCG> data) {
		super();
		this.data = data;
	}

	public TCGReponseDataList() {
		super();
	}

	public List<TCG> getData() {
		return data;
	}

	public void setData(List<TCG> data) {
		this.data = data;
	}
	
	
}
