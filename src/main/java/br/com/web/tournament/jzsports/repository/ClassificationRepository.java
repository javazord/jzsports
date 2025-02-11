package br.com.web.tournament.jzsports.repository;

import br.com.web.tournament.jzsports.model.entity.Classification;
import br.com.web.tournament.jzsports.model.entity.Tournament;
import jakarta.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassificationRepository extends JpaRepository<Classification, Long> {

    // Ordenar por mais vitórias (desc)
    List<Classification> findAllByOrderByVictoriesDesc();

    // Ordenar por mais derrotas (desc)
    List<Classification> findAllByOrderByDefeatsDesc();

    // Ordenar por mais empates (desc)
    List<Classification> findAllByOrderByDrawsDesc();

    // Ordenar por mais pontos (desc)
    List<Classification> findAllByOrderByPointsDesc();

    // Ordenar por mais partidas disputadas (desc)
    List<Classification> findAllByOrderByMatchesDesc();

    // Ordenar por mais gols marcados (desc)
    List<Classification> findAllByOrderByGoalsScoredDesc();

    // Ordenar por menos gols sofridos (asc) - Quem tomou menos gols primeiro
    List<Classification> findAllByOrderByGoalsConcededAsc();

    // Buscar a classificação de um torneio específico, ordenada por pontos (desc)
    List<Classification> findByTournamentIdOrderByPointsDesc(Long tournamentId);
}

