package br.com.sistemarh.userapi.services;

import br.com.sistemarh.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();

}
