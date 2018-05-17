public class Programa{
public static void main(String args[]){
Turma t = new Turma();
t.codigo = "MIB102";
t.professor = new Professor();
t.professor.nome = "José da Silva";
t.professor.matricula = "123456";
//fim
}
}
class Turma{
String codigo;
Professor professor;
boolean isLaboratorio;
Aluno []alunos;
}
class Professor{
String nome;
String matricula;
double salario;
}
class Aluno{
String nome;
String matricula;
double notaUm;
double notaDois;
}