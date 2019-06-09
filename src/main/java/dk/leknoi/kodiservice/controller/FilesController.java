package dk.leknoi.kodiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dk.leknoi.kodiservice.model.Files;
import dk.leknoi.kodiservice.service.IFilesService;

@RestController
@RequestMapping("/files")
public class FilesController {
	@Autowired
	private IFilesService filesService;
		
	@RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Files> listFiles() {

		return filesService.findAll();
	}

	@RequestMapping(value="/{idfile}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Files> findFiles(@PathVariable("idfile") int idFile) {

		return filesService.findAllByIdFile(idFile);
	}
	
	@RequestMapping(value="/{idfile}", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Files updateFile(@PathVariable("idfile") int idFile) {

		return null;
	}
}
