/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Salario, idade, se tem plano de saude, casado ou solteiro, nome.
 */
package aula2exercicio1;

import java.util.Scanner;

/**
 *
 * @author Odntht
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Digite o salário do professor:");
        double salario = new Scanner(System.in).nextDouble();
        System.out.println("Digite a idade da criança");
        int idade = new Scanner(System.in).nextInt();
        System.out.println("O servidor público possui plano de saúde? Se sim, digite true");
        boolean plano = new Scanner(System.in).nextBoolean();
        System.out.println("A pessoa é casada ou solteira? Digite c para casada e s para solteira");
        char estado = new Scanner(System.in).next().charAt(0);
        System.out.println("Digite o nome do aluno");
        String nome = new Scanner(System.in).nextLine();

        System.out.println("O salario do professor é: " + salario);
        System.out.println("A idade da criança é: " + idade);
        if (plano = true) {
            System.out.println("Possui plano de saude");
        } else {
            System.out.println("Não possui plano de saúde");
        }
        switch(estado){
            case 'c':
                System.out.println("A pessoa é casada");
                break;
            case 's':
                System.out.println("A pessoa é solteira");
                break;
        }
        System.out.println("O nome do aluno é: " +nome);
        
    }

}
