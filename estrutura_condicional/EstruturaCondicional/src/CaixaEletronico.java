public class CaixaEletronico {
//CONDICIONAL SIMPLES
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
            System.out.println("Seu saldo é: R$" + saldo);
                
    }
}
