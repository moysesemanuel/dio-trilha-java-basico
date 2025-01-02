package Operadores;
/*
Operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
• && Operador lógico "E"
• || Operador lógico "OU"
*/
import java.util.Scanner;

public class Logicos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            boolean condicao1 = true;
            boolean condicao2 = false;
            int idade = sc.nextInt();

            condicao2 = true;// ALTERANDO PARA MUDAR RESULTADO

//SE  condicao2 E (idade MAIOR OU IGUAL a 18) IMPRIMIR (hierarquia).       
            if (condicao2 && (idade >= 18)) {
                System.out.println("A condição é verdadeira e você é maior de idade.");
                       
            } else {
                System.out.println("A condição é verdadeira, mas você não é maior de idade.");
            }
            
            if (condicao1 && (7>4)) {
                System.out.println("As duas condições são verdadeiras");
                
            }

     //SE  condicao1 E condicao2 FOR VERDADEIRA IMPRIMIR
            if (condicao1 && condicao2) {
                System.out.println("as duas condições são verdadeiras");
            }

     //SE  condicao1 OU condicao2 FOR VERDADEIRA IMPRIMIR.
            if (condicao1 || condicao2) {
                System.out.println("Uma das condições é verdadeira");
            }
        }
        System.out.println("fim");
    }
    
}
