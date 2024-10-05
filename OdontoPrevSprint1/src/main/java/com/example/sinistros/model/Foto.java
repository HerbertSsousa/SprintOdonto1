package com.example.sinistros.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "fotos")
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFotos;

    @NotBlank
    @Column(name = "caminho_foto", nullable = false)
    private String caminhoFoto;

    @Column(name = "data_envio", nullable = false)
    private LocalDate dataEnvio;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    // Construtor padrão
    public Foto() {
    }

    // Construtor com parâmetros
    public Foto(String caminhoFoto, LocalDate dataEnvio, Usuario usuario) {
        this.caminhoFoto = caminhoFoto;
        this.dataEnvio = dataEnvio;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
