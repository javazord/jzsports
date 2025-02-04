package br.com.web.tournament.jzsports.repository;

import br.com.web.tournament.jzsports.model.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {

    //trazer o torneio de uma determinada data de inicio
    Tournament findByDateStart(String dateStart);

}
