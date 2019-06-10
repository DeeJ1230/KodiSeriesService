package dk.leknoi.kodiservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import dk.leknoi.kodiservice.controller.dto.TvShowDto;
import dk.leknoi.kodiservice.controller.mappers.ITvShowMapper;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dk.leknoi.kodiservice.model.TvShow;
import dk.leknoi.kodiservice.service.ITvShowService;

@RestController
@RequestMapping("/tvshow")
public class TvshowController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ITvShowService serieService;
	@Autowired
	private ITvShowMapper modelMapper;

	@RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TvShow> listSeries() {

		return serieService.findAll();
	}
	
	@RequestMapping(value="/{idshow}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public TvShowDto findSerie(@PathVariable("idshow") int idShow) {

		TvShow tvShow = serieService.findSerieByIdshow(idShow);
		return modelMapper.entityToDto(tvShow);
	}
	
	@RequestMapping(value="/titel/{titel}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TvShowDto> findSerieByTitel(@PathVariable("titel") String titel) {

		logger.info("Titelsearch: " + titel);

		//return serieService.findSerieByTitel(titel);
		return serieService.findSerieByTitel(titel).stream().map(s->modelMapper.entityToDto(s)).collect(Collectors.toList());
	}
}
