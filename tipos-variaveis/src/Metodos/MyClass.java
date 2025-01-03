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

}
