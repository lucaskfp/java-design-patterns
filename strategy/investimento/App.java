package strategy.investimento;

import strategy.investimento.strategies.Arrojado;
import strategy.investimento.strategies.Conservador;
import strategy.investimento.strategies.Moderado;

public class App {
    public static void main(String[] args) {
        Investimento conservador = new Conservador();
        Investimento moderado = new Moderado();
        Investimento arrojado = new Arrojado();

        Conta joao = new Conta(500);
        Conta moises = new Conta(800);
        Conta lucas = new Conta(750.5);

        RealizadorDeInvestimento realizadorDeInvestimento = new RealizadorDeInvestimento();

        realizadorDeInvestimento.realiza(joao, conservador);
        realizadorDeInvestimento.realiza(moises, moderado);
        realizadorDeInvestimento.realiza(lucas, arrojado);
    }
}
