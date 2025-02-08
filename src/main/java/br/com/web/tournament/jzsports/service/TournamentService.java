package br.com.web.tournament.jzsports.service;

import br.com.web.tournament.jzsports.model.entity.Tournament;

import java.util.List;

public interface TournamentService {

    Tournament save(Tournament tournament);
    Tournament update(Tournament tournament);
    void delete(Tournament tournament);
    Tournament findById(Long id);
    List<Tournament> findAll();

}
