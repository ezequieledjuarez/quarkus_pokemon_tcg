package org.pokemon.tcg.model;

public class Type {

	private String name;
	
	private String imagePath;

	public Type(String name, String imagePath) {
		super();
		this.name = name;
		this.imagePath = imagePath;
	}

	public Type() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
}
