package com.example.backendh93p1.controller;
import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.entity.PreguntaEntity;
import com.example.backendh93p1.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
@CrossOrigin("*")
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    @GetMapping ("/listarpreguntas")
    public ResponseEntity<?> listarPregunta (){
        return ResponseEntity.ok(preguntaService.obtenerPreguntas());
    }

    @GetMapping ("/listarpreguntas/{preguntaId}")
    public PreguntaEntity listarPreguntaId (@PathVariable("preguntaId") Long preguntaId){
        return preguntaService.obtenerPregunta(preguntaId);
    }

    @PostMapping ("/agregarpregunta")
    public ResponseEntity<PreguntaEntity> agregarPregunta (@RequestBody PreguntaEntity pregunta){
        PreguntaEntity preguntanueva = preguntaService.agregarPregunta(pregunta);
        return  ResponseEntity.ok(preguntanueva);
    }

    @PutMapping ("/actualizarexamen")
    public ResponseEntity<PreguntaEntity> actualizarPregunta (@RequestBody  PreguntaEntity pregunta){
        PreguntaEntity actualizarpregunta = preguntaService.actualizarPregunta(pregunta);
        return  ResponseEntity.ok(actualizarpregunta);
    }
}
