package dk.leknoi.kodiservice.service;

import dk.leknoi.kodiservice.model.Episode;
import dk.leknoi.kodiservice.repository.IEpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodeService implements IEpisodeService {

	@Autowired
	IEpisodeRepository episodeRepository;

	@Override
	public List<Episode> findByIdShow(int idShow) {
		return episodeRepository.findByIdShow(idShow);
	}

	@Override
	public List<Episode> findByIdFile(int idFile) {
		return episodeRepository.findByIdFile(idFile);
	}

	@Override
	public List<Episode> findAll() {
		return episodeRepository.findAll();
	}

//	@Override
//	public Episode findOne(int idEpisode) {
//		return episodeRepository.findOne(idEpisode);
//	}

}