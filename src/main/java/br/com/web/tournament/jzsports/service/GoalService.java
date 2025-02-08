package br.com.web.tournament.jzsports.service;

import br.com.web.tournament.jzsports.model.entity.Goal;

import java.util.List;

public interface GoalService {

    Goal save(Goal goal);
    Goal update(Goal goal);
    void delete(Goal goal);
    Goal findById(Long id);
    List<Goal> findAll();
    List<Goal> findAllByOrderByIdDesc();

}
