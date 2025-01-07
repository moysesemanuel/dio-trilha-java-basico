public class ResultadoEscolar {
    public static void main(String[] args) {

        //ENCADEADO
        int nota1 = 10;

        if(nota1 >= 7)
            System.out.println("Aprovado");

            else if(nota1 >= 5 && nota1 < 7)
            System.out.println("Prova de Recuperação");
        
        else
            System.out.println("Reprovado");

        //TERNÁRIO IF/ELSE
        int nota2 = 5;
                // SE        nota\/       \/   SENÃO   \/
        String resultado1 = nota2 >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado1);

        //IF/ELSE-IF/ELSE
        int nota3 = 6;
        String resultado2 = nota3 >=7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);





    }
    
}
