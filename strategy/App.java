package strategy;

import strategy.strategies.ICMS;
import strategy.strategies.ISS;

public class App {
    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(150.0);

        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        double totalIss = calculadoraDeImposto.realizaCalculo(orcamento, iss);
        double totalIcms = calculadoraDeImposto.realizaCalculo(orcamento, icms);

        System.out.println(totalIss);
        System.out.println(totalIcms);

    }
}
