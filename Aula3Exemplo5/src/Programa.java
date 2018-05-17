
public class Programa {

    public static void main(String[] arg) {
        Aluno[] alunos = Visao.criarAlunos(3);
        Visao.print(alunos);

        /*        Aluno a = Visao.lerAluno();
        System.out.println(a.nome);
        Aluno[] alunos = new Aluno[3];
        alunos[0] = new Aluno();
        alunos[0].nome = "Mariana";
        alunos[0].matricula = "UC123457";
        alunos[0].situacao = 'R';

        Aluno a = Visao.lerAluno
        alunos[1] = a;

        Aluno b = new Aluno();
        b.nome = "Jose da silva";
        b.matricula = "UC123455";
        b.situacao = 'B';

        alunos[2] = b;

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].nome);
            System.out.println(alunos[i].matricula);
            System.out.println("\n");
        }
         */
        {

        }
    }
}

class Aluno {

    String nome;
    String matricula;
    char situacao;
}
