package com.example.execution313.dao;

import com.example.execution313.models.Role;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Repository
public interface RoleDAO {

    @Transactional
    void createRole(Set<Role> roles);

    Set<Role> getAllRoles();
}
