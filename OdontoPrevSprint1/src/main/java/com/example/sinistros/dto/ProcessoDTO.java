package com.example.sinistros.dto;


import com.example.sinistros.model.Processo;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class ProcessoDTO {

    private Integer idProcesso;

    private Integer usuarioId; // Usar ID para referência

    @NotNull
    private Integer analiseId; // Referência para análise

    private LocalDate dataAnalise;

    // Construtor padrão
    public ProcessoDTO() {
    }

    // Construtor com parâmetros
    public ProcessoDTO(Integer idProcesso, Integer usuarioId, Integer analiseId, LocalDate dataAnalise) {
        this.idProcesso = idProcesso;
        this.usuarioId = usuarioId;
        this.analiseId = analiseId;
        this.dataAnalise = dataAnalise;
    }

    public ProcessoDTO(Processo processo) {
    }

    // Getters e Setters
    public Integer getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(Integer idProcesso) {
        this.idProcesso = idProcesso;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getAnaliseId() {
        return analiseId;
    }

    public void setAnaliseId(Integer analiseId) {
        this.analiseId = analiseId;
    }

    public LocalDate getDataAnalise() {
        return dataAnalise;
    }

    public void setDataAnalise(LocalDate dataAnalise) {
        this.dataAnalise = dataAnalise;
    }
}
