package dk.leknoi.kodiservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class TvshowController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ISerieService serieService;

	@RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TvShow> listSeries() {

		return serieService.findAll();
	}
	
	@RequestMapping(value="/{idshow}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public TvShow findSerie(@PathVariable("idshow") int idShow) {

		return serieService.findSerieByIdshow(idShow);
	}
	
	@RequestMapping(value="/titel/{titel}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TvShow> findSerieByTitel(@PathVariable("titel") String titel) {

		logger.info("Titelsearch: " + titel);

		return serieService.findSerieByTitel(titel);
	}
}
