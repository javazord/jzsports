package br.com.web.tournament.jzsports.service.impl;

import br.com.web.tournament.jzsports.api.error.business.BusinessException;
import br.com.web.tournament.jzsports.model.entity.Player;
import br.com.web.tournament.jzsports.repository.PlayerRepository;
import br.com.web.tournament.jzsports.service.PlayerService;

import java.util.List;

public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Player save(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player update(Long id, Player player) {
        if (!playerRepository.existsById(id)) {
            throw new BusinessException("Não foi possível atualizar o player com o id " + id);
        }
        player.setId(id);
        return playerRepository.save(player);
    }

    @Override
    public void delete(Player player) {
        playerRepository.delete(player);
    }

    @Override
    public Player findById(Long id) {
        return playerRepository.findById(id).orElseThrow(() -> new BusinessException("Não foi encontrado player com o id " + id));
    }

    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }
}
