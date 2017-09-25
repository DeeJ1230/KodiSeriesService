package dk.leknoi.kodiservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dk.leknoi.kodiservice.model.TvShow;

@Repository
public interface ISerieRepository extends CrudRepository<TvShow, Integer> {
	List<TvShow> findAll();

	TvShow findSerieByIdShow(int idShow);
}
