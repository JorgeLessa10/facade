import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class VendaFacadeTest {

    public static final Integer ANO_CORRENTE = 2022;

    @Test
    void deveEfetuarVendaJogoAntigo()
    {
        Jogo jogo = new Jogo("FIFA 20", 2020);
        boolean disponivel =  VendaFacade.verificarDisponibilidade(jogo);
        assertEquals(true, disponivel);
        Venda venda = new Venda(50);
        System.out.println("Venda realizada por: R$" + venda.getValor());
    }

    @Test
    void naoDeveEfetuarVendaJogoLancamento()
    {
        Jogo jogo = new Jogo("FIFA 22", ANO_CORRENTE);
        assertEquals(false, VendaFacade.verificarDisponibilidade(jogo));
        System.out.println("Não vendemos os jogos lançamento.");
    }

}