package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = List.of(
            new User(1311L,"Parth","123451"),
            new User(1312L,"Ankit","1232243451"),
            new User(1313L,"Ravi","09876543")
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
