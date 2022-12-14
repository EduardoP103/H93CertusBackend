package com.example.backendh93p1.repository;

import com.example.backendh93p1.entity.CategoriaEntity;
import com.example.backendh93p1.entity.ExamenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamenRepository extends JpaRepository<ExamenEntity,Long> {

    List<ExamenEntity> findByCategoria(CategoriaEntity categoriaEntity);

    List<ExamenEntity> findByActivo(Boolean estado);

    List<ExamenEntity> findByCategoriaAndActivo(CategoriaEntity categoriaEntity, Boolean estado);
}
