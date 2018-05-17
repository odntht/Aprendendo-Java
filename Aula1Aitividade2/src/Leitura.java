
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
double tempC;
System.out.print("Digite a temperatura em Celsius\n");
tempC = new Scanner(System.in).nextDouble();
double tempF = (9*tempC+160)/5;
        System.out.println(+tempF);
}}
