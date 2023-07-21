package com.springBoot.project.repository;

import com.springBoot.project.model.AuthRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AuthRoleRepository extends JpaRepository<AuthRole, Long> {
    AuthRole findByRole(String role);
}
