package com.example.sinistros.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "notificacoes")
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNotificacoes;

    @NotBlank
    @Column(name = "mensagem", nullable = false)
    private String mensagem;

    @Column(name = "data_notificacao", nullable = false)
    private LocalDate dataNotificacao;

    @Column(name = "lida", nullable = false)
    private Boolean lida = false;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    // Construtor padrão
    public Notificacao() {
    }

    // Construtor com parâmetros
    public Notificacao(String mensagem, LocalDate dataNotificacao, Boolean lida, Usuario usuario) {
        this.mensagem = mensagem;
        this.dataNotificacao = dataNotificacao;
        this.lida = lida;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

