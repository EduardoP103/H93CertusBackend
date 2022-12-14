package com.example.backendh93p1.services;

import com.example.backendh93p1.entity.CategoriaEntity;
import com.example.backendh93p1.entity.ExamenEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface ExamenService {

    ExamenEntity agregarExamen(ExamenEntity examenEntity);

    ExamenEntity actualizarExamen(ExamenEntity examenEntity);

    Set<ExamenEntity> obtenerExamenes();

    ExamenEntity obtenerExamen(Long examenId);

    void eliminarExamen(Long examenId);

    List<ExamenEntity> listarExamenesDeUnaCategoria(CategoriaEntity categoriaEntity);

    List<ExamenEntity> obtenerExamenesActivos();

    List<ExamenEntity> obtenerExamenesActivosDeUnaCategoria(CategoriaEntity categoriaEntity);
}
