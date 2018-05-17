
import java.util.Scanner; //Semelhante ao #include em linguagem C

public class Leitura {

public static void main (String args[]){
//inicio

double salario;
    System.out.println("Informe um salário");
    salario = new Scanner(System.in).nextDouble(); //Comando para ler o double
    int idade;
    System.out.println("Informe uma idade");
    idade = new Scanner(System.in).nextInt(); //Comando para ler o Int
    System.out.printf("\nO salario informado foi de %f", salario);
    System.out.println("\nA idade informada foi de "+idade);
//fim
}    
    
}
