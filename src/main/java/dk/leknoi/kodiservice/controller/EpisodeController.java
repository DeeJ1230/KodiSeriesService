package dk.leknoi.kodiservice.controller;

import dk.leknoi.kodiservice.model.Episode;
import dk.leknoi.kodiservice.service.IEpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/episode")
public class EpisodeController {
	@Autowired
	private IEpisodeService episodeService;
		
	@RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Episode> listEpisodes() {

		return episodeService.findAll();
	}
	
//	@RequestMapping(value="/{idepisode}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
//	public Episode findEpisode(@PathVariable("idepisode") int idEpisode) {
//
//		return episodeService.findOne(idEpisode);
//	}
	
	@RequestMapping(value="/tvshow/{idShow}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Episode> findByIdShow(@PathVariable("idShow") int idShow) {

		return episodeService.findByIdShow(idShow);
	}
	
	@RequestMapping(value="/files/{idFile}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Episode> findByIdFile(@PathVariable("idFile") int idFile) {

		return episodeService.findByIdFile(idFile);
	}
	
	@RequestMapping(value="/[idepisode}", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Episode updateEpisode(@PathVariable("idepisode") int idEpisode) {

		return null;
	}
}
