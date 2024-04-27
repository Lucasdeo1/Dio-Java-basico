public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + " "+ "java";

        System.out.println(nomeCompleto);


        String concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);// o programa faz a conta aritmética nos 3 primeiro valores mas logo depois ele percebe a presença de uma String, sendo assim ele entende que é para concaternar ao invés de somar concatenando o 3 + a string 1 = 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);// a principio ele entende que é uma operação de soma, só que logo após o sinal de "+" e em seguida tem uma tring ele não consegue mais efetuar uma operação arimetica resultando em uma concatenação




    }
}
