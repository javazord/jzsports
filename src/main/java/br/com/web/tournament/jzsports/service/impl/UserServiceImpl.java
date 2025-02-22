package br.com.web.tournament.jzsports.service.impl;

import br.com.web.tournament.jzsports.exception.business.BusinessException;
import br.com.web.tournament.jzsports.model.entity.User;
import br.com.web.tournament.jzsports.repository.UserRepository;
import br.com.web.tournament.jzsports.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(Long id, User user) {
        if (!userRepository.existsById(id)) {
            throw new BusinessException("Usuário com ID " + id + " não existe.");
        }
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Usuário com ID " + id + " não encontrado."));
    }

    @Override
    public Optional<User> findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public List<User> search(User user) {
        return userRepository.findAllByOrderByFirstName();
    }

    @Override
    public boolean searchUser(User user) {
        return userRepository.existsById(user.getId());
    }

}
