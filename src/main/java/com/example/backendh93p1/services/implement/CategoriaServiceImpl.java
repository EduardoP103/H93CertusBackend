package com.example.backendh93p1.services.implement;

import com.example.backendh93p1.entity.CategoriaEntity;
import com.example.backendh93p1.repository.CategoriaRepository;
import com.example.backendh93p1.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public CategoriaEntity agregarCategoria(CategoriaEntity categoriaEntity) {
        return categoriaRepository.save(categoriaEntity);
    }

    @Override
    public CategoriaEntity actualizarCategoria(CategoriaEntity categoriaEntity) {
        return categoriaRepository.save(categoriaEntity);
    }

    @Override
    public Set<CategoriaEntity> obtenerCategorias() {
        return new LinkedHashSet<>(categoriaRepository.findAll());
    }

    @Override
    public CategoriaEntity obtenerCategoria(Long categoriaId) {
        return categoriaRepository.findById(categoriaId).get();
    }

    @Override
    public void eliminarCategoria(Long categoriaId) {
        CategoriaEntity categoriaEntity = new CategoriaEntity();
        categoriaEntity.setCategoriaId(categoriaId);
        categoriaRepository.delete(categoriaEntity);
    }
}
