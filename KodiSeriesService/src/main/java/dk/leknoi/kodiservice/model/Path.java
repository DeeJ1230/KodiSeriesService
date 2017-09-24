package dk.leknoi.kodiservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "path")
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
	
	public int getIdPath() {
		return idPath;
	}
	public void setIdPath(int idPath) {
		this.idPath = idPath;
	}
	public String getStrPath() {
		return strPath;
	}
	public void setStrPath(String strPath) {
		this.strPath = strPath;
	}
	public String getStrContent() {
		return strContent;
	}
	public void setStrContent(String strContent) {
		this.strContent = strContent;
	}
	public String getStrScraper() {
		return strScraper;
	}
	public void setStrScraper(String strScraper) {
		this.strScraper = strScraper;
	}
	public String getStrHash() {
		return strHash;
	}
	public void setStrHash(String strHash) {
		this.strHash = strHash;
	}
	public int getScanRecursive() {
		if (scanRecursive != null)
			return scanRecursive;
		return 0;
	}
	public void setScanRecursive(int scanRecursive) {
		this.scanRecursive = scanRecursive;
	}
	public int getUseFolderNames() {
		if (useFolderNames != null)
			return useFolderNames;
		return 0;
	}
	public void setUseFolderNames(int useFolderNames) {
		this.useFolderNames = useFolderNames;
	}
	public String getStrSettings() {
		return strSettings;
	}
	public void setStrSettings(String strSettings) {
		this.strSettings = strSettings;
	}
	public int getNoUpdate() {
		if (noUpdate != null)
			return noUpdate;
		return 0;
	}
	public void setNoUpdate(int noUpdate) {
		this.noUpdate = noUpdate;
	}
	public int getExclude() {
		if (exclude != null)
			return exclude;
		return 0;
	}
	public void setExclude(int exclude) {
		this.exclude = exclude;
	}
	public String getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	
	
}
