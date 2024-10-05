package com.example.sinistros.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "erros")
public class Erro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idErro;

    @NotBlank
    @Column(name = "mensagem", nullable = false)
    private String mensagem;

    @Column(name = "data_ocorrencia", nullable = false)
    private LocalDate dataOcorrencia;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Construtor padrão
    public Erro(Integer idErro, Integer usuarioId, String mensagem, LocalDate dataOcorrencia) {
    }

    // Construtor com parâmetros
    public Erro(String mensagem, LocalDate dataOcorrencia, Usuario usuario) {
        this.mensagem = mensagem;
        this.dataOcorrencia = dataOcorrencia;
        this.usuario = usuario;
    }

    public Erro() {

    }

    // Getters e Setters
    public Integer getIdErro() {
        return idErro;
    }

    public void setIdErro(Integer idErro) {
        this.idErro = idErro;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getUsuarioId() {
        return 0;
    }
}
