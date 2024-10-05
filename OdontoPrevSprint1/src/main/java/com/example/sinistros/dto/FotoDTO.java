package com.example.sinistros.dto;


import com.example.sinistros.model.Foto;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

public class FotoDTO {

    private Integer idFotos;

    @NotBlank
    private String caminhoFoto;

    private LocalDate dataEnvio;

    private Integer usuarioId; // Usar ID para referência

    // Construtor padrão
    public FotoDTO() {
    }

    // Construtor com parâmetros
    public FotoDTO(Integer idFotos, String caminhoFoto, LocalDate dataEnvio, Integer usuarioId) {
        this.idFotos = idFotos;
        this.caminhoFoto = caminhoFoto;
        this.dataEnvio = dataEnvio;
        this.usuarioId = usuarioId;
    }

    public FotoDTO(Foto foto) {
    }

    // Getters e Setters
    public Integer getIdFotos() {
        return idFotos;
    }

    public void setIdFotos(Integer idFotos) {
        this.idFotos = idFotos;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    public LocalDate getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDate dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}
