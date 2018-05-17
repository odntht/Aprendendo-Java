/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2aula2;

import java.util.Scanner;

/**
 *
 * @author Odntht
 */
public class Leitura {

    public static void main(String[] args) {

        double salario;
        System.out.println("Informe um salario:");
        salario = new Scanner(System.in).nextDouble();
        int idade;
        System.out.println("Informe uma idade:");
        idade = new Scanner(System.in).nextInt();
        System.out.printf("\nO salario informado é %.2f", salario);
        System.out.println("\nA idade é "+idade);
        
    }
    
}
