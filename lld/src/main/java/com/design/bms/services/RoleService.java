package com.lld.sysdesign.bms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lld.sysdesign.bms.models.Role;
import com.lld.sysdesign.bms.repositories.interfaces.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role getRole(String id) {
        return roleRepository.getByName(id);
    }

    public Role getRoleByName(String name) {
        Optional<Role> role = roleRepository.findByName(name);
        if (!role.isPresent()) {
            throw new RuntimeException("Role not found");
        }
        return role.get();

    }

}
