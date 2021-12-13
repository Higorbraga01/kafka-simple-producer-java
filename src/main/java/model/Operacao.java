package model;

import java.math.BigInteger;
import java.time.LocalDate;

public class Operacao {

    private Long id;

    private Long numeroCreditoSolicitacao;

    private LocalDate dataOperacao;

    private String tipoOperacao;

    private Long acaoOrcamentariaId;

    private Long programaOrcamentarioId;

    private Long planoOrcamentarioId;

    private Long planoInternoId;

    private Long naturezaDespesaId;

    private String justificativaOperacao;

    private BigInteger valorOperacao;

    private String codigoUnidadeExecutora;

    private String codigoUnidadeCredora;

    public Operacao(Long id, Long numeroCreditoSolicitacao, LocalDate dataOperacao, String tipoOperacao, Long acaoOrcamentariaId, Long programaOrcamentarioId, Long planoOrcamentarioId, Long planoInternoId, Long naturezaDespesaId, String justificativaOperacao, BigInteger valorOperacao, String codigoUnidadeExecutora, String codigoUnidadeCredora) {
        this.id = id;
        this.numeroCreditoSolicitacao = numeroCreditoSolicitacao;
        this.dataOperacao = dataOperacao;
        this.tipoOperacao = tipoOperacao;
        this.acaoOrcamentariaId = acaoOrcamentariaId;
        this.programaOrcamentarioId = programaOrcamentarioId;
        this.planoOrcamentarioId = planoOrcamentarioId;
        this.planoInternoId = planoInternoId;
        this.naturezaDespesaId = naturezaDespesaId;
        this.justificativaOperacao = justificativaOperacao;
        this.valorOperacao = valorOperacao;
        this.codigoUnidadeExecutora = codigoUnidadeExecutora;
        this.codigoUnidadeCredora = codigoUnidadeCredora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeroCreditoSolicitacao() {
        return numeroCreditoSolicitacao;
    }

    public void setNumeroCreditoSolicitacao(Long numeroCreditoSolicitacao) {
        this.numeroCreditoSolicitacao = numeroCreditoSolicitacao;
    }

    public LocalDate getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(LocalDate dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Long getAcaoOrcamentariaId() {
        return acaoOrcamentariaId;
    }

    public void setAcaoOrcamentariaId(Long acaoOrcamentariaId) {
        this.acaoOrcamentariaId = acaoOrcamentariaId;
    }

    public Long getProgramaOrcamentarioId() {
        return programaOrcamentarioId;
    }

    public void setProgramaOrcamentarioId(Long programaOrcamentarioId) {
        this.programaOrcamentarioId = programaOrcamentarioId;
    }

    public Long getPlanoOrcamentarioId() {
        return planoOrcamentarioId;
    }

    public void setPlanoOrcamentarioId(Long planoOrcamentarioId) {
        this.planoOrcamentarioId = planoOrcamentarioId;
    }

    public Long getPlanoInternoId() {
        return planoInternoId;
    }

    public void setPlanoInternoId(Long planoInternoId) {
        this.planoInternoId = planoInternoId;
    }

    public Long getNaturezaDespesaId() {
        return naturezaDespesaId;
    }

    public void setNaturezaDespesaId(Long naturezaDespesaId) {
        this.naturezaDespesaId = naturezaDespesaId;
    }

    public String getJustificativaOperacao() {
        return justificativaOperacao;
    }

    public void setJustificativaOperacao(String justificativaOperacao) {
        this.justificativaOperacao = justificativaOperacao;
    }

    public BigInteger getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(BigInteger valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public String getCodigoUnidadeExecutora() {
        return codigoUnidadeExecutora;
    }

    public void setCodigoUnidadeExecutora(String codigoUnidadeExecutora) {
        this.codigoUnidadeExecutora = codigoUnidadeExecutora;
    }

    public String getCodigoUnidadeCredora() {
        return codigoUnidadeCredora;
    }

    public void setCodigoUnidadeCredora(String codigoUnidadeCredora) {
        this.codigoUnidadeCredora = codigoUnidadeCredora;
    }
}
