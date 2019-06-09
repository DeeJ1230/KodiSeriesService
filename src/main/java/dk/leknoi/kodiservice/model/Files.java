package dk.leknoi.kodiservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "files")
@Data
public class Files {

	@Id
	private int idFile;
	private Integer idPath;
	private String strFilename;
	private Integer playCount;
	private String lastPlayed;
	private String dateAdded;

}
