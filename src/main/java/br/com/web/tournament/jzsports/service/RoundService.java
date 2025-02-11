package br.com.web.tournament.jzsports.service;

import br.com.web.tournament.jzsports.model.entity.Round;

import java.util.List;

public interface RoundService {

    Round save(Round round);
    Round update(Long id, Round round);
    void delete(Round round);
    Round findById(Long id);
    Round findByTournamentId(Long tournamentId);
    List<Round> findAll();

}
