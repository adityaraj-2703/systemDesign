package com.lld.sysdesign.bms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.lld.sysdesign.bms.dto.CreateUserDTO;
import com.lld.sysdesign.bms.models.Role;
import com.lld.sysdesign.bms.models.User;
import com.lld.sysdesign.bms.repositories.interfaces.UserRepository;
import com.lld.sysdesign.bms.services.password.PasswordEncoder;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(CreateUserDTO userRequest) {

        User user = new User(userRequest.getUsername());
        user.setPassword(userRequest.getPassword(), passwordEncoder);

        Role role = roleService.getRole(userRequest.getRoleName());
        user.addRole(role);

        return userRepository.save(user);
    }

    public boolean doesUserExist(String username, String email) {

        if (userRepository.findUserByUsername(username).isPresent()) {
            return true;
        }

        return false;
    }
}
