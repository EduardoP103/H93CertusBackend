package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.CategoriaEntity;
import com.example.backendh93p1.entity.ExamenEntity;
import com.example.backendh93p1.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examen")
@CrossOrigin("*")
public class ExamenController {

    @Autowired
    private ExamenService examenService;


    @GetMapping ("/listarexamen")
    public ResponseEntity<?> listarExamen (){
        return ResponseEntity.ok(examenService.obtenerExamenes());
    }

    @GetMapping ("/listarexamen/{examenId}")
    public CategoriaEntity listarExamenId (@PathVariable("examenId") Long examenId){
        return examenService.obtenerExamen(examenId).getCategoria();
    }

    @GetMapping("/examencategoria")
    public List<ExamenEntity> examencategoria(){
        return examenService.listarExamenesDeUnaCategoria(new CategoriaEntity());
    }
}
