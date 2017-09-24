package dk.leknoi.kodiservice.service;

import java.util.List;

import dk.leknoi.kodiservice.model.Episode;

public interface IEpisodeService {
	List<Episode> findAll();
	Episode findOne(int idEpisode);
	List<Episode> findByIdShow(int idShow);
	List<Episode> findByIdFile(int idFile);
}
