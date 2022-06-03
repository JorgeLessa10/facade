/*
 ** created by: jorge.lessa
 */
public class Venda {

    private double valor;

    public Venda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean efetuarVenda(Jogo jogo)
    {
        return VendaFacade.verificarDisponibilidade(jogo);
    }

}
