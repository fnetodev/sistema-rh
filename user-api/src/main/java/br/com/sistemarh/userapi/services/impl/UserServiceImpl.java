package br.com.sistemarh.userapi.services.impl;

import br.com.sistemarh.userapi.domain.User;
import br.com.sistemarh.userapi.repositories.UserRepository;
import br.com.sistemarh.userapi.services.UserService;
import br.com.sistemarh.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  final UserRepository respository;

    @Override
    public User findById(Long id) {
        return respository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return respository.findAll();
    }
}
