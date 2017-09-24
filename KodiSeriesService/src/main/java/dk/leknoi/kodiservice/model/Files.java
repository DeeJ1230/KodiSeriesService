package dk.leknoi.kodiservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "files")
public class Files {

	@Id
	private int idFile;
	private int idPath;
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
	public int getIdPath() {
		return idPath;
	}
	public void setIdPath(int idPath) {
		this.idPath = idPath;
	}
	public String getStrFilename() {
		return strFilename;
	}
	public void setStrFilename(String strFilename) {
		this.strFilename = strFilename;
	}
	public int getPlayCount() {
		if (playCount != null)
			return playCount;
		return 0;
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
