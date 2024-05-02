import java.text.NumberFormat;

public class ExemploExcessao {
    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75");
        Number valor;
        try{
        
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);  
        
        } catch (parseExcepction e) {
            e.printStackTrace();
        }
        
       
    }
}
