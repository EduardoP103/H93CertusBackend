package com.example.backendh93p1.services.implement;


import com.example.backendh93p1.entity.CategoriaEntity;
import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.repository.ExamenRepository;
import com.example.backendh93p1.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class ExamenServiceImpl implements ExamenService {

    @Autowired
    private ExamenRepository examenRepository;

    @Override
    public ExamenEntity agregarExamen(ExamenEntity examenEntity) {
        return examenRepository.save(examenEntity);
    }

    @Override
    public ExamenEntity actualizarExamen(ExamenEntity examenEntity) {
        return examenRepository.save(examenEntity);
    }

    @Override
    public Set<ExamenEntity> obtenerExamenes() {
        return new LinkedHashSet<>(examenRepository.findAll());
    }

    @Override
    public ExamenEntity obtenerExamen(Long examenId) {
        return examenRepository.findById(examenId).get();
    }

    @Override
    public void eliminarExamen(Long examenId) {
        ExamenEntity examenEntity = new ExamenEntity();
        examenEntity.setExamenId(examenId);
        examenRepository.delete(examenEntity);
    }

    @Override
    public List<ExamenEntity> listarExamenesDeUnaCategoria(CategoriaEntity categoriaEntity) {
        return this.examenRepository.findByCategoria(categoriaEntity);
    }

    @Override
    public List<ExamenEntity> obtenerExamenesActivos() {
        return examenRepository.findByActivo(true);
    }

    @Override
    public List<ExamenEntity> obtenerExamenesActivosDeUnaCategoria(CategoriaEntity categoriaEntity) {
        return examenRepository.findByCategoriaAndActivo(categoriaEntity,true);
    }
}
