public class ExempoForArray {
    public static void main(String[] args) {
        String alunos [] = { "Felipe", "Lucas", "Teus"};

        for ( int i=0; i < alunos.length; i++){
            System.out.println("O aluno do indice " + i +" é " + alunos[i] );
        }

        for(String aluno : alunos ){
            System.out.println("O nome do aluno é " + aluno );
        }    



    }
}
