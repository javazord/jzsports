package br.com.web.tournament.jzsports.repository;

import br.com.web.tournament.jzsports.model.entity.Round;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoundRepository extends JpaRepository<Round, Long> {

    //trazer as partidas onde o id_tournament = ?
    List<Round> findAllByTournamentId(Long tournamentId);

}
