package Operadores;
/*O operador de condição ternária é uma forma resumida para definir uma condição e escolher por dentro os dois valores. Você deve pensar numa condição ternária como se fosse uma condição if-else, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.
 * O operador ternário é representado pelos símbolos ?=.
 */
//EXEMPLOS

public class OperadorTernario {

    public static void main(String[] args){

int a, b;

a = 5;
b = 6;

/* EXEMPLO CONDICIONAL UTILIZANDO UMA ESTRUTURA IF-ELSE */

String resultado = "";

if(a==b)
    resultado = "verdadeiro";
else
    resultado = "falso";

    System.out.println(resultado);

//USANDO EXEMPLO COM OPERADOR TERNÁRIO 

    b = 5; //ALTERANDO O VALOR DE B PARA MUDAR A RESPOSTA.
   

resultado = a==b ?"verdadeiro" : "falso";
System.out.println(resultado);
    }
}
