package dk.leknoi.kodiservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dk.leknoi.kodiservice.model.Episode;

public interface IEpisodeRepository extends JpaRepository<Episode, Integer> {
	List<Episode> findByIdShow(int idShow);
	List<Episode> findByIdFile(int idFile);
}
