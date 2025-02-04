package br.com.web.tournament.jzsports.repository;

import br.com.web.tournament.jzsports.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    //trazer a lista de players onde o id do time = ?
    List<Player> findPlayersByTeamId(Long teamId);

}
