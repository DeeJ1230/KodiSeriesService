package dk.leknoi.kodiservice.service;

import java.util.List;

import dk.leknoi.kodiservice.model.Path;

public interface IPathService {
	List<Path> findAll();
	Path updatePath(Path path);
}

