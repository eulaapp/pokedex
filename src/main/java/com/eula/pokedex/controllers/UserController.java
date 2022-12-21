package com.eula.pokedex.controllers;

import com.eula.pokedex.models.UserModel;
import com.eula.pokedex.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/trainer")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Object> saveUser(@RequestBody UserModel userModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserModel>> getAllUser() {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.findAll());
    }

}
