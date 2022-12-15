package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/examen")
@CrossOrigin("*")

public class ExamenController {

    @Autowired
    private ExamenService examenService;

    @GetMapping
    public List<ExamenEntity> busquedaexamen() {
        return (List<ExamenEntity>) examenService.obtenerExamenes();
    }

    @PostMapping
    public void crearexamen(@RequestBody ExamenEntity examenClient) {
        examenService.agregarExamen(examenClient);
    }

    @PutMapping
    public void actualizarExamen(@RequestBody ExamenEntity examenClient){
        examenService.actualizarExamen(examenClient);
    }
    @GetMapping (value = "{idexamen}")
    public ExamenEntity obtenerExamenId (@PathVariable ("idexamen") Long idexamen){
        return examenService.obtenerExamen(idexamen);

    }
}