package com.example.backendh93p1.repository;

import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.entity.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PreguntaRepository extends JpaRepository<PreguntaEntity,Long> {
    Set<PreguntaEntity> findByExamen(ExamenEntity examenEntity);
}
