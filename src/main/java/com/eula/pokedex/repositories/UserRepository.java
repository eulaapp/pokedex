package com.eula.pokedex.repositories;

import com.eula.pokedex.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

    UserModel save(UserModel userModel);
}
