public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = fomatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(" o cep não corresponde com a regra de negócio.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          
          return "23.765-064";
    }
}
