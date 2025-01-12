package EstruturasExcepcionais;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("81580450");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep precisa ter 8 dígitos.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() !=8)
            throw new CepInvalidoException();

            //simulando um cep formatado
            return "81.580-450";         
    }
}
