package com.example.sinistros.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

public class UsuarioDTO {

    private Integer idUser;

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    @Size(max = 11)
    private String cpf;

    @NotBlank
    @Size(max = 255)
    private String senha;

    private LocalDate dataCriacao;

    private List<FotoDTO> fotos;
    private List<ErroDTO> erros;  // Supondo que você tenha um ErroDTO
    private List<ProcessoDTO> processos; // Supondo que você tenha um ProcessoDTO
    private List<NotificacaoDTO> notificacoes;

    // Construtor padrão
    public UsuarioDTO() {
    }

    // Construtor com parâmetros
    public UsuarioDTO(Integer idUser, String nome, String cpf, String senha, LocalDate dataCriacao,
                      List<FotoDTO> fotos, List<ErroDTO> erros,
                      List<ProcessoDTO> processos, List<NotificacaoDTO> notificacoes) {
        this.idUser = idUser;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
        this.fotos = fotos;
        this.erros = erros;
        this.processos = processos;
        this.notificacoes = notificacoes;
    }

    // Getters e Setters
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<FotoDTO> getFotos() {
        return fotos;
    }

    public void setFotos(List<FotoDTO> fotos) {
        this.fotos = fotos;
    }

    public List<ErroDTO> getErros() {
        return erros;
    }

    public void setErros(List<ErroDTO> erros) {
        this.erros = erros;
    }

    public List<ProcessoDTO> getProcessos() {
        return processos;
    }

    public void setProcessos(List<ProcessoDTO> processos) {
        this.processos = processos;
    }

    public List<NotificacaoDTO> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<NotificacaoDTO> notificacoes) {
        this.notificacoes = notificacoes;
    }
}
