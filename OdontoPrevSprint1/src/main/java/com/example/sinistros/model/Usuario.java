package com.example.sinistros.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "data_criacao", nullable = false)
    private LocalDate dataCriacao;

    public Usuario() {

    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public @NotBlank @Size(max = 100) String getNome() {
        return nome;
    }

    public void setNome(@NotBlank @Size(max = 100) String nome) {
        this.nome = nome;
    }

    public @NotBlank @Size(max = 11) String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank @Size(max = 11) String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank @Size(max = 255) String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank @Size(max = 255) String senha) {
        this.senha = senha;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public List<Erro> getErros() {
        return erros;
    }

    public void setErros(List<Erro> erros) {
        this.erros = erros;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    public List<Sair> getSairs() {
        return sairs;
    }

    public void setSairs(List<Sair> sairs) {
        this.sairs = sairs;
    }

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Foto> fotos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Erro> erros;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Processo> processos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Notificacao> notificacoes;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Sair> sairs;

    // Getters, setters, and constructors


    public Usuario(Integer idUser, String nome, String cpf, String senha, LocalDate dataCriacao, List<Foto> fotos, List<Erro> erros, List<Processo> processos, List<Notificacao> notificacoes, List<Sair> sairs) {
        this.idUser = idUser;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
        this.fotos = fotos;
        this.erros = erros;
        this.processos = processos;
        this.notificacoes = notificacoes;
        this.sairs = sairs;
    }
}
