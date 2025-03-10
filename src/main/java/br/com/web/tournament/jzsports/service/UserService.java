package br.com.web.tournament.jzsports.service;

import br.com.web.tournament.jzsports.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);
    User update(Long id, User user);
    User findById(Long id);
    Optional<User> findByLogin(String login);
    List<User> search(User user);
    boolean searchUser(User user);

}
