package dk.leknoi.kodiservice.controller;

import dk.leknoi.kodiservice.controller.dto.TvShowDto;
import dk.leknoi.kodiservice.controller.dto.mappers.ITvShowMapper;
import dk.leknoi.kodiservice.model.TvShow;
import dk.leknoi.kodiservice.service.ITvShowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping(value="", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TvShow> listSeries() {

		return serieService.findAll();
	}
	
	@GetMapping(value="/{idshow}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse<TvShowDto> findSerie(@PathVariable("idshow") int idShow) {

		TvShow tvShow = serieService.findSerieByIdshow(idShow);
		return new ApiResponse<>(modelMapper.entityToDto(tvShow));
	}
	
	@GetMapping(value="/titel/{titel}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse<List<TvShowDto>> findSerieByTitel(@PathVariable("titel") String titel) {

		logger.info("Titelsearch: " + titel);
		ApiResponse<List<TvShowDto>> result = new ApiResponse<>(serieService.findSerieByTitel(titel).stream().map(s->modelMapper.entityToDto(s)).collect(Collectors.toList()));
		logger.info("Rows in result: " + result.getResult().size());

		return result;
	}
}
