package com.example.sinistros.controller;

import com.example.sinistros.dto.ErroDTO;
import com.example.sinistros.service.ErroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/erros")
public class ErroController {

    @Autowired
    private ErroService erroService;

    @GetMapping
    public ResponseEntity<List<ErroDTO>> listarErros() {
        List<ErroDTO> erros = erroService.listarErros();
        return ResponseEntity.ok(erros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ErroDTO> buscarErroPorId(@PathVariable Integer id) {
        Optional<ErroDTO> erro = erroService.buscarErroPorId(id);
        return erro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ErroDTO> criarErro(@RequestBody ErroDTO erroDTO) {
        ErroDTO novoErro = erroService.criarErro(erroDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoErro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ErroDTO> atualizarErro(@PathVariable Integer id, @RequestBody ErroDTO erroDTO) {
        ErroDTO erroAtualizado = erroService.atualizarErro(id, erroDTO);
        return ResponseEntity.ok(erroAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarErro(@PathVariable Integer id) {
        erroService.deletarErro(id);
        return ResponseEntity.noContent().build();
    }
}
