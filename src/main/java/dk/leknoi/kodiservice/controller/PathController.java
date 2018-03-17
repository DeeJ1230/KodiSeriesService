package dk.leknoi.kodiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dk.leknoi.kodiservice.model.Path;
import dk.leknoi.kodiservice.service.IPathService;

@RestController
@RequestMapping("/path")
public class PathController {
	@Autowired
	IPathService pathService;

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Path> listPath() {
		return pathService.findAll();
	}

	@RequestMapping(value = "/{idPath}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Path getPath(@PathVariable("idPath") int idPath) {
		return pathService.findOne(idPath);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Path updatePath(@RequestBody Path path) {
		return pathService.updatePath(path);
	}
}
