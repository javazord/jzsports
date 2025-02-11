package br.com.web.tournament.jzsports.service;

import br.com.web.tournament.jzsports.model.entity.Classification;

import java.util.List;

public interface ClassificationService {

    Classification save(Classification classification);
    Classification update(Long id, Classification classification);
    Classification findById(Long id);
    List<Classification> findAll();
    List<Classification> findAllByOrderByVictoriesDesc();
    List<Classification> findAllByOrderByDefeatsDesc();
    List<Classification> findAllByOrderByDrawsDesc();
    List<Classification> findAllByOrderByPointsDesc();
    List<Classification> findAllByOrderByMatchesDesc();
    List<Classification> findAllByOrderByGoalsScoredDesc();
    List<Classification> findAllByOrderByGoalsConcededAsc();
    List<Classification> findByTournamentIdOrderByPointsDesc(Long tournamentId);

}
