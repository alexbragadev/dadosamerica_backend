package com.americadados.americadados.service;

import com.americadados.americadados.domain.User;
import com.americadados.americadados.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImp implements UserService{
    private final UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to the database", user.getName());
        return userRepo.save(user);
    }

//    @Override
//    public Role saveRole(Role role) {
//        log.info("Saving new role {} to the database", role.getName());
//        return roleRepo.save(role);
//    }
//
//    @Override
//    public void addRoleToUser(String userName, String roleName) {
//        log.info("Adding role {} to user {}", roleName, userName);
//        User user = userRepo.findByUserName(userName);
//        Role role = roleRepo.findByname(roleName);
//        user.getRoles().add(role);
//    }

    @Override
    public User getUser(String email) {
        log.info("Fetching user {}", email);
        return userRepo.findByUserName(email);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }
}
