package com.lld.sysdesign.bms.repositories.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lld.sysdesign.bms.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> getRoleByName(String customer);

    Role getByName(String id);

    Optional<Role> findByName(String name);
}
