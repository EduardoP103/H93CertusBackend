package com.example.backendh93p1.services.implement;

import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.entity.PreguntaEntity;
import com.example.backendh93p1.repository.PreguntaRepository;
import com.example.backendh93p1.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PreguntaServiceImpl implements PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public PreguntaEntity agregarPregunta(PreguntaEntity preguntaEntity) {
        return preguntaRepository.save(preguntaEntity);
    }

    @Override
    public PreguntaEntity actualizarPregunta(PreguntaEntity preguntaEntity) {
        return preguntaRepository.save(preguntaEntity);
    }

    @Override
    public Set<PreguntaEntity> obtenerPreguntas() {
        return (Set<PreguntaEntity>) preguntaRepository.findAll();
    }

    @Override
    public PreguntaEntity obtenerPregunta(Long preguntaId) {
        return preguntaRepository.findById(preguntaId).get();
    }

    @Override
    public Set<PreguntaEntity> obtenerPreguntasDelExamen(ExamenEntity examenEntity) {
        return preguntaRepository.findByExamen(examenEntity);
    }

    @Override
    public void eliminarPregunta(Long preguntaId) {
        PreguntaEntity preguntaEntity = new PreguntaEntity();
        preguntaEntity.setPreguntaId(preguntaId);
        preguntaRepository.delete(preguntaEntity);
    }

    @Override
    public PreguntaEntity listarPregunta(Long preguntaId) {
        return this.preguntaRepository.getOne(preguntaId);
    }
}
