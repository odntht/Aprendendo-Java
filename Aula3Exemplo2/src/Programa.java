
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        double num = lerDouble("Informe um salário", "Ops! Valor inválido", 800, 10000);
        System.out.println("O valor lido foi " + num);

        double nota = lerDouble("Informe a nota ", "Nota inválida", 0, 10);
        System.out.println("A nota informada foi " + nota);
    }

    public static double lerDouble(String msgUsuario, String msgErro, double min, double max) {
        double retorno;

        do {
            retorno = lerDouble(msgUsuario);
            if (retorno < min || retorno > max) {
                System.out.println(msgErro);
            }
        } while (retorno < min || retorno > max);
        return retorno;
    }

    public static double lerDouble(String msgUsuario) {
        System.out.println(msgUsuario);
        return lerDouble();
    }

    public static double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }
}
