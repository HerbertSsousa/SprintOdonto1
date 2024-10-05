package com.example.sinistros.dto;


import com.example.sinistros.model.Erro;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

public class ErroDTO {

    private Integer idErro;

    private Integer usuarioId; // Usar ID para referência

    @NotBlank
    private String mensagem;

    private LocalDate dataOcorrencia;

    // Construtor padrão
    public ErroDTO() {
    }

    // Construtor com parâmetros
    public ErroDTO(Integer idErro, Integer usuarioId, String mensagem, LocalDate dataOcorrencia) {
        this.idErro = idErro;
        this.usuarioId = usuarioId;
        this.mensagem = mensagem;
        this.dataOcorrencia = dataOcorrencia;
    }

    public ErroDTO(Erro erro) {
    }

    // Getters e Setters
    public Integer getIdErro() {
        return idErro;
    }

    public void setIdErro(Integer idErro) {
        this.idErro = idErro;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(LocalDate dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }
}
