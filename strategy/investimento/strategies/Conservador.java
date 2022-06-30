package strategy.investimento.strategies;

import strategy.investimento.Conta;
import strategy.investimento.Investimento;

public class Conservador implements Investimento {

    @Override
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.008;
    }

}
