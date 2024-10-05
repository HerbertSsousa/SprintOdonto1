package com.example.sinistros.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "sair")
public class Sair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSair;

    @Column(name = "data_saida", nullable = false)
    private LocalDate dataSaida;

    @NotBlank
    @Column(name = "ip_endereco", nullable = false)
    private String ipEndereco;

    @NotBlank
    @Column(name = "session_id", nullable = false)
    private String sessionId;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    // Construtor padrão
    public Sair() {
    }

    // Construtor com parâmetros
    public Sair(LocalDate dataSaida, String ipEndereco, String sessionId, Usuario usuario) {
        this.dataSaida = dataSaida;
        this.ipEndereco = ipEndereco;
        this.sessionId = sessionId;
        this.usuario = usuario;
    }

    // Getters e Setters
    public Integer getIdSair() {
        return idSair;
    }

    public void setIdSair(Integer idSair) {
        this.idSair = idSair;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getIpEndereco() {
        return ipEndereco;
    }

    public void setIpEndereco(String ipEndereco) {
        this.ipEndereco = ipEndereco;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


