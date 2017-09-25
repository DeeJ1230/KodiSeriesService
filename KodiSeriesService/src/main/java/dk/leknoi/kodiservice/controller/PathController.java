package dk.leknoi.kodiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dk.leknoi.kodiservice.model.Path;
import dk.leknoi.kodiservice.service.IPathService;

@RestController
@RequestMapping("/path")
public class PathController {
	@Autowired
	IPathService pathService;
		
	@RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Path> listFiles() {
		return pathService.findAll();
	}
}
