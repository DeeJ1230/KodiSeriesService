package dk.leknoi.kodiservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dk.leknoi.kodiservice.model.Path;
import dk.leknoi.kodiservice.repository.IPathRepository;

@Service
public class PathService implements IPathService {

	@Autowired
	private IPathRepository pathRepository;

	@Override
	public List<Path> findAll() {
		return pathRepository.findAll();
	}

	@Override
	public Path findOne(int idPath) {
		return pathRepository.findOne(idPath);
	}

	@Override
	public Path updatePath(Path path) {
//		Path updatedPath = pathRepository.findOne(path.getIdPath());
//		updatedPath.setStrPath(path.getStrPath());
//		pathRepository.save(updatedPath);
//		return updatedPath;
		return null;
	}
}
