/*

Receber dois valores e realizar a soma por meio de metodos e apresentar.


 */

public class Somador {

    public static void main(String args[]) {

        double valorUm = 10;
        double valorDois = 1;
        double retorno = somar(valorUm, valorDois);
        System.out.println("O valor do metodo é "+retorno);
    }
//os metodos devem ficar dentro da classe e fora do main

    public static double somar(double paramUm, double paramDois) {
        return (paramUm + paramDois);
    }
}
