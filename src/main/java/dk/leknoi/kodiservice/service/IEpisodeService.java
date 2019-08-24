package dk.leknoi.kodiservice.service;

import dk.leknoi.kodiservice.model.Episode;

import java.util.List;

public interface IEpisodeService {
	List<Episode> findAll();
//	Episode findOne(int idEpisode);
	List<Episode> findByIdShow(int idShow);
	List<Episode> findByIdFile(int idFile);
}
