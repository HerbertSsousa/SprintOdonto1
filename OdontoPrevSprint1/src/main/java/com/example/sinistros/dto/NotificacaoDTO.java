package com.example.sinistros.dto;


import com.example.sinistros.model.Notificacao;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

public class NotificacaoDTO {

    private Integer idNotificacoes;

    @NotBlank
    private String mensagem;

    private LocalDate dataNotificacao;

    private Boolean lida;

    private Integer usuarioId; // Usar ID para referência

    // Construtor padrão
    public NotificacaoDTO() {
    }

    // Construtor com parâmetros
    public NotificacaoDTO(Integer idNotificacoes, String mensagem, LocalDate dataNotificacao, Boolean lida, Integer usuarioId) {
        this.idNotificacoes = idNotificacoes;
        this.mensagem = mensagem;
        this.dataNotificacao = dataNotificacao;
        this.lida = lida;
        this.usuarioId = usuarioId;
    }

    public NotificacaoDTO(Notificacao notificacao) {
    }

    // Getters e Setters
    public Integer getIdNotificacoes() {
        return idNotificacoes;
    }

    public void setIdNotificacoes(Integer idNotificacoes) {
        this.idNotificacoes = idNotificacoes;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(LocalDate dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public Boolean getLida() {
        return lida;
    }

    public void setLida(Boolean lida) {
        this.lida = lida;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}
