package br.com.web.tournament.jzsports.service.impl;

import br.com.web.tournament.jzsports.api.error.business.BusinessException;
import br.com.web.tournament.jzsports.model.entity.Round;
import br.com.web.tournament.jzsports.repository.RoundRepository;
import br.com.web.tournament.jzsports.service.RoundService;

import java.util.List;

public class RoundServiceImpl implements RoundService {

    private final RoundRepository roundRepository;

    public RoundServiceImpl(RoundRepository roundRepository) {
        this.roundRepository = roundRepository;
    }

    @Override
    public Round save(Round round) {
        return roundRepository.save(round);
    }

    @Override
    public Round update(Long id, Round round) {
        if (!roundRepository.existsById(id)) {
            throw new BusinessException("Erro ao atualizar o rodada.");
        }
        round.setId(id);
        return roundRepository.save(round);
    }

    @Override
    public void delete(Round round) {
        roundRepository.delete(round);
    }

    @Override
    public Round findById(Long id) {
        return roundRepository.findById(id).orElseThrow(() -> new BusinessException("Erro ao buscar o rodada."));
    }

    @Override
    public Round findByTournamentId(Long tournamentId) {
        return roundRepository.findByTournamentId(tournamentId);
    }

    @Override
    public List<Round> findAll() {
        return roundRepository.findAll();
    }
}
