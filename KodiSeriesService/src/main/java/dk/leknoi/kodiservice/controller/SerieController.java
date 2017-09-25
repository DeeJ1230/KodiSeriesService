package dk.leknoi.kodiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dk.leknoi.kodiservice.model.Episode;
import dk.leknoi.kodiservice.model.TvShow;
import dk.leknoi.kodiservice.repository.IEpisodeRepository;
import dk.leknoi.kodiservice.service.ISerieService;

@RestController
@RequestMapping("/tvshow")
public class SerieController {
	@Autowired
	ISerieService serieService;

	@RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TvShow> listSeries() {
		return serieService.findAll();
	}
	
	@RequestMapping(value="/{idshow}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public TvShow findSerie(@PathVariable("idshow") int idShow) {
		return serieService.findSerieByIdshow(idShow);
	}
}
