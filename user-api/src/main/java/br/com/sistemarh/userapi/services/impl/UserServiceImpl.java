package br.com.sistemarh.userapi.services.impl;

import br.com.sistemarh.userapi.domain.User;
import br.com.sistemarh.userapi.repositories.UserRepository;
import br.com.sistemarh.userapi.services.UserService;
import br.com.sistemarh.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  final UserRepository respository;
    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get Request on " + env.getProperty("local.server.port") + " port");
        return respository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return respository.findAll();
    }
}
