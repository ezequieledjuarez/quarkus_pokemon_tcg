package org.pokemon.tcg.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class TypesData {

	@JsonProperty("data")
	private List<String> types;

	public TypesData() {
		super();
	}

	public TypesData(List<String> types) {
		super();
		this.types = types;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}
}
