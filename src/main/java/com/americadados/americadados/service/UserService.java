package com.americadados.americadados.service;

import com.americadados.americadados.domain.Role;
import com.americadados.americadados.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
//    Role saveRole(Role role);
//    void addRoleToUser(String userName, String roleName);
    User getUser(String email);
    List<User>getUsers();
}
