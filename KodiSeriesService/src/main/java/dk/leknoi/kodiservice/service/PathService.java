package dk.leknoi.kodiservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dk.leknoi.kodiservice.model.Path;
import dk.leknoi.kodiservice.repository.IPathRepository;

@Service
public class PathService implements IPathService {

	@Autowired
	IPathRepository pathRepository;
	
	@Override
	public List<Path> findAll() {
		return pathRepository.findAll();
	}

}
