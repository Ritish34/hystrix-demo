package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    //fake data
    List<User> list = List.of(
            new User(1311L,"Ritish Parmar","1234567890"),
            new User(1312L,"Utsav Dabhi","9876542310"),
            new User(1314L,"Jay Dabhi","98765555310")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
