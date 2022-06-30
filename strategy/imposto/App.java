package strategy.imposto;

import strategy.imposto.strategies.ICCC;
import strategy.imposto.strategies.ICMS;
import strategy.imposto.strategies.ISS;

public class App {
    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(150.0);

        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        double totalIss = calculadoraDeImposto.realizaCalculo(orcamento, iss);
        double totalIcms = calculadoraDeImposto.realizaCalculo(orcamento, icms);
        double totalIccc = calculadoraDeImposto.realizaCalculo(orcamento, iccc);

        System.out.println(totalIss);
        System.out.println(totalIcms);
        System.out.println(totalIccc);

    }
}
