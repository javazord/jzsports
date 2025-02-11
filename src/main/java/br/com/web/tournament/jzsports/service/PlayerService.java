package br.com.web.tournament.jzsports.service;

import br.com.web.tournament.jzsports.model.entity.Player;

import java.util.List;

public interface PlayerService {

    Player save(Player player);
    Player update(Long id, Player player);
    void delete(Player player);
    Player findById(Long id);
    List<Player> findAll();

}
