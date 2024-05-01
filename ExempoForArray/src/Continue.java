public class Continue {
    public static void main(String[] args) {
        for ( int num = 1; num <= 5; num++ ){
            if( num == 3 ){
                continue; //ao encontrar num == 3 ele pula o 3 e continua a roda o codigo
            }
            System.out.println(num);
        }
   


        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }
     }
}
