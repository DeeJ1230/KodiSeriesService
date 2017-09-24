package dk.leknoi.kodiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dk.leknoi.kodiservice.model.Episode;
import dk.leknoi.kodiservice.model.Files;
import dk.leknoi.kodiservice.model.TvShow;
import dk.leknoi.kodiservice.repository.IEpisodeRepository;
import dk.leknoi.kodiservice.repository.IFilesRepository;
import dk.leknoi.kodiservice.service.IFilesService;
import dk.leknoi.kodiservice.service.ISerieService;

@RestController
@RequestMapping("/files")
public class FilesController {
	@Autowired
	IFilesService filesService;
		
	@RequestMapping("")
	public List<Files> listFiles() {
		return filesService.findAll();
	}

	@RequestMapping("/{idfile}")
	public List<Files> findFiles(@PathVariable("idfile") int idFile) {
		return filesService.findAllByIdFile(idFile);
	}
}
