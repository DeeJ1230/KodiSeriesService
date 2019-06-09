package dk.leknoi.kodiservice.controller;

import java.util.List;

import dk.leknoi.kodiservice.controller.dto.TvShowDto;
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
	private ModelMapper modelMapper;

	@RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TvShow> listSeries() {

		return serieService.findAll();
	}
	
	@RequestMapping(value="/{idshow}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public TvShowDto findSerie(@PathVariable("idshow") int idShow) {

		TvShow tvShow = serieService.findSerieByIdshow(idShow);
		return modelMapper.map(tvShow, TvShowDto.class);
	}
	
	@RequestMapping(value="/titel/{titel}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TvShow> findSerieByTitel(@PathVariable("titel") String titel) {

		logger.info("Titelsearch: " + titel);

		return serieService.findSerieByTitel(titel);
	}

	private TvShowDto convertToDto(TvShow tvShow) {
		TvShowDto tvShowDto = modelMapper.map(tvShow, TvShowDto.class);
//		postDto.setSubmissionDate(post.getSubmissionDate(),
//				userService.getCurrentUser().getPreference().getTimezone());
		return tvShowDto;
	}

//	private Post convertToEntity(PostDto postDto) throws ParseException {
//		Post post = modelMapper.map(postDto, Post.class);
//		post.setSubmissionDate(postDto.getSubmissionDateConverted(
//				userService.getCurrentUser().getPreference().getTimezone()));
//
//		if (postDto.getId() != null) {
//			Post oldPost = postService.getPostById(postDto.getId());
//			post.setRedditID(oldPost.getRedditID());
//			post.setSent(oldPost.isSent());
//		}
//		return post;
//	}
}
