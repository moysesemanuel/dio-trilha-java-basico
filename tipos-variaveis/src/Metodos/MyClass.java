package Metodos;

public class MyClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        int num1 = 5;
        int num2 = 3;

        double resultado = myClass.somar(num1, num2);
        System.out.println("resultado da soma: " + resultado);
    }

    //EXEMPLOS DAS AULAS



    public double somar(int num1, int num2){
        return num1 + num2;
    }

    public void imprimir(String texto){
        /*LOGICA - FINALIDADE DO MÉTODO
          AQUI NÃO PRECISA DO RETURN, POIS NÃO SERÁ RETORNADO NENHUM VALOR
        */
    }
    //throw Exception : indica que o método ao ser utilizado poderá gerar uma exceção.

    public double dividir(int dividendo, int divisor) throws Exception{
            return divisor;}

    //este método não pode ser visto por outras classes no programa
    @SuppressWarnings("unused")
    private void metodoPrivado(){}

    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //no caso boolean (true ou flase)
    }
        

    public void calcularEnviar(){
        //um método deve representar uma única resposta
    }
        
    public void gravarCliente(String nome, String cpf, Integer idade){
        //este método te a finalidade de gravar informações de um cliente, por que não criar um objeto cliente e passar como parâmetro?
        //veja abaixo
    }
    
    public <Cliente> void gravarCliente(Cliente cliente){}
    //ou
    public <Cliente> void gravar(Cliente cliente){}
}
