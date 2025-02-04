package br.com.web.tournament.jzsports.repository;

import br.com.web.tournament.jzsports.model.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Long> {

    //buscar gols de uma determinada partida onde o player_id = ?
    List<Goal> findByRoundIdAndPlayerId(Long roundId, Long playerId);

    //buscar todos os gols de um jogador
    List<Goal> findByPlayerId(Long playerId);

}
