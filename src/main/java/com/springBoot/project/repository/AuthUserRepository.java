package com.springBoot.project.repository;

import com.springBoot.project.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
    AuthUser findByEmail(String email);
}
