package strategy.investimento.strategies;

import java.util.Random;

import strategy.investimento.Conta;
import strategy.investimento.Investimento;

public class Moderado implements Investimento {

    @Override
    public double calcula(Conta conta) {
        int random = new Random().nextInt(2);
        if (random == 0) {
            return conta.getSaldo() * 0.025;
        }
        return conta.getSaldo() * 0.007;
    }

}
