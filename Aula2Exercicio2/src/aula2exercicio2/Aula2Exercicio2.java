/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2exercicio2;

import java.util.Scanner;

/**
 *
 * @author Odntht
 */
public class Aula2Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite o valor original do produto:");
        double valor = new Scanner(System.in).nextDouble();
        System.out.println("Digite a taxa de juros mensal (em %):");
        double taxa = new Scanner(System.in).nextDouble();
        double divida = valor*(taxa/100)+valor;
        System.out.println("O valor atual da divida é: "+divida);
    }

}
