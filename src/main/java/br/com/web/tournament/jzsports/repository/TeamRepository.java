package br.com.web.tournament.jzsports.repository;

import br.com.web.tournament.jzsports.model.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {

    //trazer os times pela classificação por onde decrescente
    List<Team> findByClassificationDesc();
    List<Team> findByTeamName(String teamName);
    List<Team> findByUserId(Long id);

}
