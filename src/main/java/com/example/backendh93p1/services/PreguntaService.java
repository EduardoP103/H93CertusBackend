package com.example.backendh93p1.services;

import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.entity.PreguntaEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface PreguntaService {

    PreguntaEntity agregarPregunta(PreguntaEntity preguntaEntity);

    PreguntaEntity actualizarPregunta(PreguntaEntity preguntaEntity);

    Set<PreguntaEntity> obtenerPreguntas();

    PreguntaEntity obtenerPregunta(Long preguntaId);

    Set<PreguntaEntity> obtenerPreguntasDelExamen(ExamenEntity examenEntity);

    void eliminarPregunta(Long preguntaId);

    PreguntaEntity listarPregunta(Long preguntaId);
}
