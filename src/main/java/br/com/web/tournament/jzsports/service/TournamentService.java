package br.com.web.tournament.jzsports.service;

import br.com.web.tournament.jzsports.model.entity.Tournament;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TournamentService {

    Tournament save(Tournament tournament);
    Tournament update(Long id, Tournament tournament);
    void delete(Tournament tournament);
    Tournament findById(Long id);
    List<Tournament> findAll();
    List<Tournament> findAllByOrderByStartDateDesc();

}
