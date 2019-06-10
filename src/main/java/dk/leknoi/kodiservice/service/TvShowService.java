package dk.leknoi.kodiservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dk.leknoi.kodiservice.model.TvShow;
import dk.leknoi.kodiservice.repository.ISerieRepository;

@Service
public class TvShowService implements ITvShowService {

	@Autowired
	private ISerieRepository serieRepository;

	@Override
	public List<TvShow> findAll() {
		return serieRepository.findAll();
	}

	@Override
	public TvShow findSerieByIdshow(int idShow) {
		return serieRepository.findOne(idShow);
	}

	@Override
	public List<TvShow> findSerieByTitel(String titel) {
		// return serieRepository.findByTitelContaining(titel);
		return serieRepository.findByShowTitleContaining(titel);
	}
}
