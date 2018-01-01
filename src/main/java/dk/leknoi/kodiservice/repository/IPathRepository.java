package dk.leknoi.kodiservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dk.leknoi.kodiservice.model.Files;
import dk.leknoi.kodiservice.model.Path;

@Repository
public interface IPathRepository extends CrudRepository<Path, Integer> {
	List<Path> findAll();
}
