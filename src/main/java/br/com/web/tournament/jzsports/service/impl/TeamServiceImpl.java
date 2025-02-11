package br.com.web.tournament.jzsports.service.impl;

import br.com.web.tournament.jzsports.api.error.business.BusinessException;
import br.com.web.tournament.jzsports.model.entity.Team;
import br.com.web.tournament.jzsports.repository.TeamRepository;
import br.com.web.tournament.jzsports.service.TeamService;

import java.util.List;

public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team save(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team update(Long id, Team team) {
        if (!teamRepository.existsById(id)) {
            throw new BusinessException("Time com o id "+ id +" não encontrado.");
        }
        team.setId(id);
        return teamRepository.save(team);
    }

    @Override
    public void delete(Long id) {
        teamRepository.deleteById(id);
    }

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    @Override
    public List<Team> findByTeamName(String teamName) {
        return teamRepository.findByTeamName(teamName);
    }

    @Override
    public List<Team> findByUserId(Long id) {
        return teamRepository.findByUserId(id);
    }
}
