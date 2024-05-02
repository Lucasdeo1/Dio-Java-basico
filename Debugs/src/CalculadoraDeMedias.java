import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro"};

        int media = calcularMediaTurma( alunos, scan );

        System.out.println("Media da turma " + media);

    }

    public static int calcularMediaTurma( String [] alunos, Scanner scanner ) {

        int soma = 0;
        for ( String aluno : alunos ) {
            System.out.println("Nota do aluno: " + aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }    
        return soma/alunos.length;
    }
}
