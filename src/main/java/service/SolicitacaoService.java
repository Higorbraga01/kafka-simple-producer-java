package service;

import kafka.producer.KafkaDispatcher;
import dto.OperacaoDTO;
import dto.SolicitacaoDTO;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class SolicitacaoService {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (KafkaDispatcher orderDispatcher = new KafkaDispatcher<SolicitacaoDTO>()) {
            SolicitacaoDTO solicitacao = criarSolicitacao();
            orderDispatcher.send("ALTERACAO_ORCAMENTARIA", solicitacao.getNumeroCreditoSolicitacao(), solicitacao);
        }
    }

    private static SolicitacaoDTO criarSolicitacao() {
        OperacaoDTO anulacao = new OperacaoDTO(
                1L, 1L, LocalDate.now(), "Anulacao", 386L,
                522L, 732L, 777L, 999L,
                "Rquero", new BigInteger("20000"), "222298",
                "222278");
        OperacaoDTO complementacao = new OperacaoDTO(
                2L, 1L, LocalDate.now(), "Complementacao", 386L,
                522L, 732L, 777L, 999L,
                "Rquero", new BigInteger("20000"), "222298",
                "222278");
        List<OperacaoDTO> operacoes = new ArrayList<>();
        operacoes.addAll(Arrays.asList(anulacao, complementacao));
        SolicitacaoDTO solicitacao = new SolicitacaoDTO(
                1L, operacoes,"2021","Fernando Tomasio", LocalDate.now(),
                "222298","N/A");
        return solicitacao;
    }
}
