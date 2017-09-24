package dk.leknoi.kodiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dk.leknoi.kodiservice.model.Path;
import dk.leknoi.kodiservice.service.IPathService;

@RestController
@RequestMapping("/path")
public class PathController {
	@Autowired
	IPathService pathService;
		
	@RequestMapping("")
	public List<Path> listFiles() {
		return pathService.findAll();
	}
//	
//	@RequestMapping("/{idepisode}")
//	public Episode findEpisode(@PathVariable("idepisode") int idepisode) {
//		return episodeRepository.findOne(idepisode);
//	}
//	
//	@RequestMapping("/tvshow/{idshow}")
//	public List<Episode> findByIdshow(@PathVariable("idshow") int idshow) {
//		return episodeRepository.findByIdshow(idshow);
//	}
}
