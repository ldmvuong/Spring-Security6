package com.example.Security6.ldmv.repository;

import com.example.Security6.ldmv.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("SELECT u FROM Role u WHERE u.name = :name")
    public Role getUserByName(@Param("name") String name);
    Optional<Role> findByName(String name);
}