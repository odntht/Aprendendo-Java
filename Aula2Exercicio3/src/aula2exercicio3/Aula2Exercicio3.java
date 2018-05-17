/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2exercicio3;

import java.util.Scanner;
/**
 *
 * @author Odntht
 */
public class Aula2Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("Digite seu nome");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Digite seu salário");
        double salario = new Scanner(System.in).nextDouble();
        System.out.println("Digite o quanto você vendeu esse mês");
        double venda = new Scanner(System.in).nextDouble();
        double adicional = venda*0.15;
        double remuneracao = salario+adicional;
        System.out.println("Seu nome é:" +nome);
        System.out.println("Seu salário esse mês será:" +remuneracao);
    
    }
    
}
