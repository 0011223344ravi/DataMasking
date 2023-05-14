package com.example.datamasking.service;

import com.example.datamasking.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {

    public List<Users> getAllUsers() {

        Users user1 = new Users("john", "baba1234", "1234567890", 30);
        Users user2 = new Users("Ravi", "baba1234", "1234567890", 28);


        return Stream.of(user1, user2).collect(Collectors.toList());
    }

    public Users getUser(String name) {
        return getAllUsers().stream().filter(user -> user.getUsername() .equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("user not found"));
    }
}
