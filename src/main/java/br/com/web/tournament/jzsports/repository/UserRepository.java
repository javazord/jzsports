package br.com.web.tournament.jzsports.repository;

import br.com.web.tournament.jzsports.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);
    List<User> findAllByOrderByFirstName();
    boolean existsByLogin(String login);

}
