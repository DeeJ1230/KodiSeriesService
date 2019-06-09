package dk.leknoi.kodiservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "episode")
@Data
public class Episode {

	@Id
	private int idEpisode;
	private int idFile;
	private String c00;
	private String c01;
	private String c02;
	private String c03;
	private String c04;
	private String c05;
	private String c06;
	private String c07;
	private String c08;
	private String c09;
	private String c10;
	private String c11;
	private String c12;
	private String c13;
	private String c14;
	private String c15;
	private String c16;
	private String c17;
	private String c18;
	private String c19;
	private String c20;
	private String c21;
	private String c22;
	private String c23;
	private int idShow;

}
