package dk.leknoi.kodiservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "path")
@Data
@ToString
public class Path {

	@Id
	private int idPath;
	private String strPath;
	private String strContent;
	private String strScraper;
	private String strHash;
	private Integer scanRecursive;
	private Integer useFolderNames;
	private String strSettings;
	private Integer noUpdate;
	private Integer exclude;
	private String dateAdded;

}
