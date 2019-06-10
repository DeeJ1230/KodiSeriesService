package dk.leknoi.kodiservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "tvshow")
@Data
public class TvShow {

	@Id
	private int idShow;
//	public int getIdShow() {
//		return idShow;
//	}

	@Column(name = "c00")
	private String showTitle;
	@Column(name = "c01")
	private String plotSummary;
	@Column(name = "c02")
	private String status;

	private String c03;
	@Column(name = "c04")
	private String rating;
	@Column(name = "c05")
	private String firstAired;
	@Column(name = "c06")
	private String thumbnailURL;

	private String c07;

	@Column(name = "c08")
	private String genre;
	@Column(name = "c09")
	private String originalTitle;
	@Column(name = "c10")
	private String episodeGuideURL;
	@Column(name = "c11")
	private String fanArtURL;
	@Column(name = "c12")
	private String uniqueKodiID;
	@Column(name = "c13")
	private String contentRating;
	@Column(name = "c14")
	private String studio;
	@Column(name = "c15")
	private String titleFormattedForSorting;
	@Column(name = "c16")
	private String trailer;

	private String c17;
	private String c18;
	private String c19;
	private String c20;
	private String c21;
	private String c22;
	private String c23;

}
