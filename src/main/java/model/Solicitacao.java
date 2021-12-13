package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Solicitacao {

    private Long numeroCreditoSolicitacao;

    private List<Operacao> operacoes = new ArrayList<>();

    private String exercicio;

    private String nomeExecutor;

    private LocalDate dataSolicitacao;

    private String codigoUnidadeSolicitante;

    private String descricaoSolicitacao;

    public Solicitacao(Long numeroCreditoSolicitacao, List<Operacao> operacoes, String exercicio, String nomeExecutor, LocalDate dataSolicitacao, String codigoUnidadeSolicitante, String descricaoSolicitacao) {
        this.numeroCreditoSolicitacao = numeroCreditoSolicitacao;
        this.operacoes = operacoes;
        this.exercicio = exercicio;
        this.nomeExecutor = nomeExecutor;
        this.dataSolicitacao = dataSolicitacao;
        this.codigoUnidadeSolicitante = codigoUnidadeSolicitante;
        this.descricaoSolicitacao = descricaoSolicitacao;
    }

    public Long getNumeroCreditoSolicitacao() {
        return numeroCreditoSolicitacao;
    }

    public void setNumeroCreditoSolicitacao(Long numeroCreditoSolicitacao) {
        this.numeroCreditoSolicitacao = numeroCreditoSolicitacao;
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(List<Operacao> operacoes) {
        this.operacoes = operacoes;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public String getNomeExecutor() {
        return nomeExecutor;
    }

    public void setNomeExecutor(String nomeExecutor) {
        this.nomeExecutor = nomeExecutor;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getCodigoUnidadeSolicitante() {
        return codigoUnidadeSolicitante;
    }

    public void setCodigoUnidadeSolicitante(String codigoUnidadeSolicitante) {
        this.codigoUnidadeSolicitante = codigoUnidadeSolicitante;
    }

    public String getDescricaoSolicitacao() {
        return descricaoSolicitacao;
    }

    public void setDescricaoSolicitacao(String descricaoSolicitacao) {
        this.descricaoSolicitacao = descricaoSolicitacao;
    }
}
