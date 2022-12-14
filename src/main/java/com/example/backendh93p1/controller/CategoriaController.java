package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.CategoriaEntity;
import com.example.backendh93p1.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

    @Autowired
    private CategoriaService  categoriaService;

    @GetMapping ("/listar")
    public ResponseEntity<?> listarCategoria (){
        return ResponseEntity.ok(categoriaService.obtenerCategorias());
    }

    @GetMapping ("/listar/{idCategoria}")
    public CategoriaEntity listarCategoriaId (@PathVariable ("idCategoria") Long idCategoria){
        return categoriaService.obtenerCategoria(idCategoria);
    }

    @PostMapping ("/agregar")
    public ResponseEntity<CategoriaEntity> agregarCategoria (@RequestBody CategoriaEntity categoriaEntity){
        CategoriaEntity categorianueva = categoriaService.agregarCategoria(categoriaEntity);
        return  ResponseEntity.ok(categorianueva);
    }
}
