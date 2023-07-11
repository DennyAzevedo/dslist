package br.dev.md.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.md.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
