package dk.leknoi.kodiservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dk.leknoi.kodiservice.model.Files;

@Repository
public interface IFilesRepository extends CrudRepository<Files, Integer> {
	List<Files> findAll();
	List<Files> findAllByIdFile(int idFile);
}
