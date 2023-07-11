package br.dev.md.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.md.dslist.dto.GameMinDTO;
import br.dev.md.dslist.entities.Game;
import br.dev.md.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		//return dto;
		return result.stream().map(GameMinDTO::new).toList();
	}
}

