package dk.leknoi.kodiservice.service;

import dk.leknoi.kodiservice.model.TvShow;
import dk.leknoi.kodiservice.repository.ITvShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvShowService implements ITvShowService {

	@Autowired
	private ITvShowRepository serieRepository;

	@Override
	public List<TvShow> findAll() {
		return serieRepository.findAll();
	}

	@Override
	public TvShow findSerieByIdshow(int idShow) {
		return null;
	}

//	@Override
//	public TvShow findSerieByIdshow(int idShow) {
//		return serieRepository.findOne(idShow);
//	}

	@Override
	public List<TvShow> findSerieByTitel(String titel) {
		return serieRepository.findByShowTitleContaining(titel);
	}
}
