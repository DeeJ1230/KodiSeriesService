package dk.leknoi.kodiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dk.leknoi.kodiservice.model.Episode;
import dk.leknoi.kodiservice.model.TvShow;
import dk.leknoi.kodiservice.service.IEpisodeService;

@RestController
@RequestMapping("/episode")
public class EpisodeController {
	@Autowired
	IEpisodeService episodeService;
		
	@RequestMapping("")
	public List<Episode> listEpisodes() {
		return episodeService.findAll();
	}
	
	@RequestMapping("/{idepisode}")
	public Episode findEpisode(@PathVariable("idepisode") int idEpisode) {
		return episodeService.findOne(idEpisode);
	}
	
	@RequestMapping("/tvshow/{idShow}")
	public List<Episode> findByIdShow(@PathVariable("idShow") int idShow) {
		return episodeService.findByIdShow(idShow);
	}
	
	@RequestMapping("/files/{idFile}")
	public List<Episode> findByIdFile(@PathVariable("idFile") int idFile) {
		return episodeService.findByIdFile(idFile);
	}
}
