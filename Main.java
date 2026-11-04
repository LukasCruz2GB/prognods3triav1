import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        System.out.println("--- CADASTRO DO ALUNO ---");
        System.out.print("Nome do Aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("CPF do Aluno: ");
        String cpfAluno = scanner.nextLine();
        System.out.print("Matrícula do Aluno: ");
        String matriculaAluno = scanner.nextLine();

        Aluno aluno = new Aluno(nomeAluno, cpfAluno, matriculaAluno);
        listaDePessoas.add(aluno);

        System.out.println("\n--- CADASTRO DO PROFESSOR ---");
        System.out.print("Nome do Professor: ");
        String nomeProf = scanner.nextLine();
        System.out.print("CPF do Professor: ");
        String cpfProf = scanner.nextLine();
        System.out.print("Disciplina do Professor: ");
        String disciplinaProf = scanner.nextLine();

        Professor professor = new Professor(nomeProf, cpfProf, disciplinaProf);
        listaDePessoas.add(professor);

        System.out.println("\n=== DADOS CADASTRADOS (POLIMORFISMO) ===");
        for (Pessoa p : listaDePessoas) {
            p.exibirDados(); 
        }

        scanner.close();
    }
}
