package aula02cursoemvideo;

public class Aula02CursoEmVideo {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Host";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }

}
