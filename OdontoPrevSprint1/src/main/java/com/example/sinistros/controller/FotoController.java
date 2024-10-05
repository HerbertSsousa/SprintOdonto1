package com.example.sinistros.controller;

import com.example.sinistros.dto.FotoDTO;
import com.example.sinistros.service.FotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fotos")
public class FotoController {

    @Autowired
    private FotoService fotoService;

    @GetMapping
    public ResponseEntity<List<FotoDTO>> listarFotos() {
        List<FotoDTO> fotos = fotoService.listarFotos();
        return ResponseEntity.ok(fotos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FotoDTO> buscarFotoPorId(@PathVariable Integer id) {
        Optional<FotoDTO> foto = fotoService.buscarFotoPorId(id);
        return foto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FotoDTO> criarFoto(@RequestBody FotoDTO fotoDTO) {
        FotoDTO novaFoto = fotoService.criarFoto(fotoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaFoto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FotoDTO> atualizarFoto(@PathVariable Integer id, @RequestBody FotoDTO fotoDTO) {
        FotoDTO fotoAtualizada = fotoService.atualizarFoto(id, fotoDTO);
        return ResponseEntity.ok(fotoAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFoto(@PathVariable Integer id) {
        fotoService.deletarFoto(id);
        return ResponseEntity.noContent().build();
    }
}
