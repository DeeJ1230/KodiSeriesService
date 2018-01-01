package dk.leknoi.kodiservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "files")
public class Files {

	@Id
	private int idFile;
	private Integer idPath;
	private String strFilename;
	private Integer playCount;
	private String lastPlayed;
	private String dateAdded;
	
	public int getIdFile() {
		return idFile;
	}
	public void setIdFile(int idFile) {
		this.idFile = idFile;
	}
	public Integer getIdPath() {
		return idPath;
	}
	public void setIdPath(Integer idPath) {
		this.idPath = idPath;
	}
	public String getStrFilename() {
		return strFilename;
	}
	public void setStrFilename(String strFilename) {
		this.strFilename = strFilename;
	}
	public Integer getPlayCount() {
		return playCount;
	}
	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}
	public String getLastPlayed() {
		return lastPlayed;
	}
	public void setLastPlayed(String lastPlayed) {
		this.lastPlayed = lastPlayed;
	}
	public String getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
}
