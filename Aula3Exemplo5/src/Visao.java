
public class Visao {

    public static Aluno lerAluno() {
        Aluno a = new Aluno();
        a.nome = Leitor.lerString("Informe o nome do Aluno: ");
        a.matricula = Leitor.lerString("Informe a matricula d@ " + a.nome + " : ");
        a.situacao = Leitor.lerCaractere("Informe a situação: ");
        return a;
    }

    public static Aluno[] criarAlunos(int quantidade) {
        Aluno[] alunos = new Aluno[quantidade];
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = lerAluno();
        }
        return alunos;
    }
    
    public static void print(Aluno aluno){
        System.out.println("Nome: "+aluno.nome);
        System.out.println("Matricula: "+aluno.matricula);
        System.out.println("Situação: "+aluno.situacao);
        System.out.println();
    }
    
    public static void print(Aluno[] alunos){
        for (int i = 0; i < alunos.length; i++) {
            print(alunos[i]);
        }
    }
}
