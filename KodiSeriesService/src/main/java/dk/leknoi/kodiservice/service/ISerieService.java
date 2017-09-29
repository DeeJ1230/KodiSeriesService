package dk.leknoi.kodiservice.service;

import java.util.List;

import dk.leknoi.kodiservice.model.TvShow;

public interface ISerieService {
	List<TvShow> findAll();
	TvShow findSerieByIdshow(int idShow);
	List<TvShow> findSerieByTitel(String titel);
}
