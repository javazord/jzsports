package br.com.web.tournament.jzsports.service.impl;

import br.com.web.tournament.jzsports.api.error.business.BusinessException;
import br.com.web.tournament.jzsports.model.entity.Tournament;
import br.com.web.tournament.jzsports.repository.TournamentRepository;
import br.com.web.tournament.jzsports.service.TournamentService;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class TournamentServiceImpl  implements TournamentService {

    private final TournamentRepository tournamentRepository;

    public TournamentServiceImpl(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    @Override
    public Tournament save(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    @Override
    public Tournament update(Long id, Tournament tournament) {
        if (!tournamentRepository.existsById(tournament.getId())) {
            throw new BusinessException("Torneio não encontrado");
        }
        tournament.setId(id);
        return tournamentRepository.save(tournament);
    }

    @Override
    public void delete(Tournament tournament) {
        tournamentRepository.delete(tournament);
    }

    @Override
    public Tournament findById(Long id) {
        return tournamentRepository.findById(id).orElseThrow(() -> new BusinessException("Torneio não encontrado."));
    }

    @Override
    public List<Tournament> findAll() {
        return tournamentRepository.findAll();
    }

    @Override
    public List<Tournament> findAllByOrderByStartDateDesc() {
        return tournamentRepository.findAllByOrderByStartDateDesc();
    }


}
