package com.example.backendh93p1.repository;

import com.example.backendh93p1.entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuriousRepository extends JpaRepository<UsuariosEntity,Integer> {

    public UsuariosEntity findByUsername (String username);

}
