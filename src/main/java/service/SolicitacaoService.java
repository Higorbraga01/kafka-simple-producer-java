package service;

import kafka.producer.KafkaDispatcher;
import model.Operacao;
import model.Solicitacao;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class SolicitacaoService {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (KafkaDispatcher orderDispatcher = new KafkaDispatcher<Solicitacao>()) {
            Solicitacao solicitacao = criarSolicitacao();
            orderDispatcher.send("ALTERACAO_ORCAMENTARIA", solicitacao.getNumeroCreditoSolicitacao(), solicitacao);
        }
    }

    private static Solicitacao criarSolicitacao() {
        Operacao anulacao = new Operacao(
                1L, 1L, LocalDate.now(), "Anulacao", 386L,
                522L, 732L, 777L, 999L,
                "Rquero", new BigInteger("20000"), "222298",
                "222278");
        Operacao complementacao = new Operacao(
                2L, 1L, LocalDate.now(), "Complementacao", 386L,
                522L, 732L, 777L, 999L,
                "Rquero", new BigInteger("20000"), "222298",
                "222278");
        List<Operacao> operacoes = new ArrayList<>();
        operacoes.addAll(Arrays.asList(anulacao, complementacao));
        Solicitacao solicitacao = new Solicitacao(
                1L, operacoes,"2021","Fernando Tomasio", LocalDate.now(),
                "222298","N/A");
        return solicitacao;
    }
}
