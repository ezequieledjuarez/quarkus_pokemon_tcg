package org.pokemon.tcg.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Set implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4980086678748887476L;
	
	private String id;
	private String name;
	private String series;
	private Long printedTotal;
	private Long total;
	private Legalities legalities;
	private String ptcgoCode;
	private String releaseDate;
	private String updatedAt;
	private Image images;

	public Set() {
		super();
	}
	public Set(String id, String name, String series, Long printedTotal, Long total, Legalities legalities, String ptcgoCode, String releaseDate, String updatedAt, Image images) {
		this.id = id;
		this.name = name;
		this.series = series;
		this.printedTotal = printedTotal;
		this.total = total;
		this.legalities = legalities;
		this.ptcgoCode = ptcgoCode;
		this.releaseDate = releaseDate;
		this.updatedAt = updatedAt;
		this.images = images;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getSeries() {
		return this.series;
	}

	public Long getPrintedTotal() {
		return this.printedTotal;
	}

	public Long getTotal() {
		return this.total;
	}

	public Legalities getLegalities() {
		return this.legalities;
	}

	public String getPtcgoCode() {
		return this.ptcgoCode;
	}

	public String getReleaseDate() {
		return this.releaseDate;
	}

	public String getUpdatedAt() {
		return this.updatedAt;
	}

	public Image getImages() {
		return this.images;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public void setPrintedTotal(Long printedTotal) {
		this.printedTotal = printedTotal;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public void setLegalities(Legalities legalities) {
		this.legalities = legalities;
	}

	public void setPtcgoCode(String ptcgoCode) {
		this.ptcgoCode = ptcgoCode;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setImages(Image images) {
		this.images = images;
	}
}
