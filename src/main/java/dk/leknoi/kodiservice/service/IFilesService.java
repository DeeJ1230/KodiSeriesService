package dk.leknoi.kodiservice.service;

import java.util.List;

import dk.leknoi.kodiservice.model.Files;

public interface IFilesService {
	List<Files> findAll();
	List<Files> findAllByIdFile(int idFile);
}
