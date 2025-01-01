package Operadores;
/*Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado. */

/*• == Quando desejamos verificar se uma variável é IGUAL A outra.
 *• != Quando desejamos verificar se uma variável é DIFERENTE da outra.
  • > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
  • >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
  • < Quando desejamos verificar se uma variável é MENOR QUE a outra.
  • <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
 */
public class OperadorRelacional {
    public static void main(String[] args){

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        //if(numero1 > numero2);

    }
}
