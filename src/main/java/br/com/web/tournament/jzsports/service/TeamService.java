package br.com.web.tournament.jzsports.service;

import br.com.web.tournament.jzsports.model.entity.Team;

import java.util.List;

public interface TeamService {

    Team save(Team team);
    Team update(Long id, Team team);
    void delete(Long id);
    List<Team> findAll();
    List<Team> findByTeamName(String teamName);
    List<Team> findByUserId(Long id);

}
