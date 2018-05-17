/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2exercicio4;

import java.util.Scanner;

/**
 *
 * @author Odntht
 */
public class Aula2Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] idade = new int[10];
        double[] altura = new double[10];
        System.out.println("Digite a idade de 10 pessoas:");
        for (int i = 0; i < idade.length; i++) {
            idade[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Agora digite as respectivas alturas");
        for (int i = 0; i < idade.length; i++) {
            altura[i] = new Scanner(System.in).nextDouble();
        }
        for (int i = 0; i < idade.length; i++) {
            System.out.print(idade[i]);
        }
    }

}
