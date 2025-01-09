public class ExemploFor {
    public static void main(String[] args) {
        for(int carneiro = 1; carneiro <= 20; carneiro ++){
            System.out.println("Contando carneiros " + carneiro);
        }
        //em arrays o indice de elementos inicia em zero
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }
    }
    
}
