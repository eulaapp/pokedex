package com.eula.pokedex.services;

import com.eula.pokedex.models.UserModel;
import com.eula.pokedex.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
     UserRepository userRepository;

    @Transactional
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public List<UserModel> findAll() {
        return  userRepository.findAll();
    }
}
