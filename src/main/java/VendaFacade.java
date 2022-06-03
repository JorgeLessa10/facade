/*
 ** created by: jorge.lessa
 */

public class VendaFacade {

    public static final Integer ANO_CORRENTE = 2022;

    public static boolean verificarDisponibilidade(Jogo jogo)
    {

        if (jogo.getAnoLancamento() == ANO_CORRENTE.intValue())
        {
            return false;
        }
        return true;
    }

}
