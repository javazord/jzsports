package br.com.web.tournament.jzsports.service.impl;

import br.com.web.tournament.jzsports.api.error.business.BusinessException;
import br.com.web.tournament.jzsports.model.entity.Goal;
import br.com.web.tournament.jzsports.repository.GoalRepository;
import br.com.web.tournament.jzsports.service.GoalService;

import java.util.List;

public class GoalServiceImpl implements GoalService {

    private final GoalRepository goalRepository;

    public GoalServiceImpl(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    @Override
    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    @Override
    public Goal update(Long id, Goal goal) {
        if (!goalRepository.existsById(id)) {
            throw new BusinessException("Gol não encontrado");
        }
        goal.setId(id);
        return goalRepository.save(goal);
    }

    @Override
    public void delete(Goal goal) {
        goalRepository.delete(goal);
    }

    @Override
    public Goal findById(Long id) {
        return goalRepository.findById(id).orElseThrow(() -> new BusinessException("Gol com o id "+ id + "não encontrado"));
    }

    @Override
    public List<Goal> findAll() {
        return goalRepository.findAll();
    }

    @Override
    public List<Goal> findAllByOrderByIdDesc() {
        return goalRepository.findAllByOrderByIdDesc();
    }
}
