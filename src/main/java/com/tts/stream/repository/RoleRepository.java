package com.tts.stream.repository;

import java.util.Optional;

import com.tts.stream.model.ERole;
import com.tts.stream.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}