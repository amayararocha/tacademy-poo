package exerciciosextras.exercicioextra1;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Mayara", 25, "2024");
        Aluno aluno2 = new Aluno("Larissa", 34, "2023");
        Aluno aluno3 = new Aluno("Bruna", 35, "2021");
        Aluno[] alunos = new Aluno[]{aluno1, aluno2, aluno3};

        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
