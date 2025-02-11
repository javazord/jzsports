package br.com.web.tournament.jzsports.service.impl;

import br.com.web.tournament.jzsports.api.error.business.BusinessException;
import br.com.web.tournament.jzsports.model.entity.Classification;
import br.com.web.tournament.jzsports.repository.ClassificationRepository;
import br.com.web.tournament.jzsports.service.ClassificationService;

import java.util.List;

public class ClassificationServiceImpl implements ClassificationService {

    private final ClassificationRepository repository;

    public ClassificationServiceImpl(ClassificationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Classification save(Classification classification) {
        return repository.save(classification);
    }

    @Override
    public Classification update(Long id, Classification classification) {
        if (!repository.existsById(id)) {
            throw new BusinessException("Classificação com id "+ id +" não encontrada.");
        }
        classification.setId(id);
        return repository.save(classification);
    }

    @Override
    public Classification findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new BusinessException("Classificação não encontrada."));
    }

    @Override
    public List<Classification> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Classification> findAllByOrderByVictoriesDesc() {
        return repository.findAllByOrderByVictoriesDesc();
    }

    @Override
    public List<Classification> findAllByOrderByDefeatsDesc() {
        return repository.findAllByOrderByDefeatsDesc();
    }

    @Override
    public List<Classification> findAllByOrderByDrawsDesc() {
        return repository.findAllByOrderByDrawsDesc();
    }

    @Override
    public List<Classification> findAllByOrderByPointsDesc() {
        return repository.findAllByOrderByPointsDesc();
    }

    @Override
    public List<Classification> findAllByOrderByMatchesDesc() {
        return repository.findAllByOrderByMatchesDesc();
    }

    @Override
    public List<Classification> findAllByOrderByGoalsScoredDesc() {
        return repository.findAllByOrderByGoalsScoredDesc();
    }

    @Override
    public List<Classification> findAllByOrderByGoalsConcededAsc() {
        return repository.findAllByOrderByGoalsConcededAsc();
    }

    @Override
    public List<Classification> findByTournamentIdOrderByPointsDesc(Long tournamentId) {
        return repository.findByTournamentIdOrderByPointsDesc(tournamentId);
    }


}
