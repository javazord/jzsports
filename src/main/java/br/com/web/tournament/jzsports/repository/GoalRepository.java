package br.com.web.tournament.jzsports.repository;

import br.com.web.tournament.jzsports.model.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Long> {

    List<Goal> findByRoundIdAndPlayerId(Long roundId, Long playerId);
    List<Goal> findByPlayerId(Long playerId);
    List<Goal> findAllByOrderByIdDesc();

}
