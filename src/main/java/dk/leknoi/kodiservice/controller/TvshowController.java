package dk.leknoi.kodiservice.controller;

import dk.leknoi.kodiservice.controller.dto.TvShowDto;
import dk.leknoi.kodiservice.controller.dto.mappers.ITvShowMapper;
import dk.leknoi.kodiservice.model.TvShow;
import dk.leknoi.kodiservice.service.ITvShowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
	
	@GetMapping(value="/{idshow}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse<TvShowDto> findSerie(@PathVariable("idshow") int idShow) {

		TvShow tvShow = serieService.findSerieByIdshow(idShow);
		return new ApiResponse<>(modelMapper.entityToDto(tvShow));
	}
	
	@RequestMapping(value="/titel/{titel}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse<List<TvShowDto>> findSerieByTitel(@PathVariable("titel") String titel) {

		logger.info("Titelsearch: " + titel);

		return new ApiResponse<>(serieService.findSerieByTitel(titel).stream().map(s->modelMapper.entityToDto(s)).collect(Collectors.toList()));
	}
}
