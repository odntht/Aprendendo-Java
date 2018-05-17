
import java.util.Scanner;

public class Programa {

    public static void main(String args[]) {
        System.out.println("Digite P para cadastrar um Professor ou digite A para cadastrar um Administrador");
        char tipo = new Scanner(System.in).next().charAt(0);
        if (tipo == 'p') {
            System.out.println("O tipo escolhido foi Professor");
            System.out.println("Digite seu nome");
            String nome = new Scanner(System.in).nextLine();
            System.out.println("Digite seu salário");
            double salario = new Scanner(System.in).nextDouble();
            System.out.println("Digite sua titulacao");
            String titulacao = new Scanner(System.in).nextLine();
            double imposto = salario * 0.23;
            System.out.println("");
            System.out.println("Professor.");
            System.out.println("Nome: " + nome);
            System.out.println("Salario: " + salario);
            System.out.println("Titulação: " + titulacao);
            System.out.println("Imposto de Renda: " + imposto);
        } else {
            System.out.println("O tipo escolhido foi Administrativo");
            System.out.println("Digite seu nome");
            String nome = new Scanner(System.in).nextLine();
            System.out.println("Digite seu salário");
            double salario = new Scanner(System.in).nextDouble();
            System.out.println("Digite a quantidade de dependentes");
            int dependentes = new Scanner(System.in).nextInt();
            double sindicato = salario * 0.01;
            System.out.println("");
            System.out.println("Administrativo.");
            System.out.println("Nome: " + nome);
            System.out.println("Salario: " + salario);
            System.out.println("Quantidade de Dependentes: " + dependentes);
            System.out.println("Contribuição Sindical: " + sindicato);
        }
    }

}
