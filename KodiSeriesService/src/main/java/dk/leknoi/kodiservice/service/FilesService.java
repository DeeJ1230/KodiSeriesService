package dk.leknoi.kodiservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dk.leknoi.kodiservice.model.Files;
import dk.leknoi.kodiservice.repository.IFilesRepository;

@Service
public class FilesService implements IFilesService {

	@Autowired
	IFilesRepository filesRepository;
	
	@Override
	public List<Files> findAll() {
		return filesRepository.findAll();
	}

	@Override
	public List<Files> findAllByIdFile(int idFile) {
		return filesRepository.findAllByIdFile(idFile);
	}

}
