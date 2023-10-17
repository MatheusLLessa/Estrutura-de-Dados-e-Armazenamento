package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploThrows {
    public static int divide(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("\nDigite um número");
            int numerador = leitor.nextInt();
            System.out.println("\nDigite outro número");
            int denominador = leitor.nextInt();
            System.out.println(numerador + "/" + denominador + "=" + divide(numerador, denominador));
        }
        catch (ArithmeticException erro){
            System.out.println("\nDivisão por zero");
            erro.printStackTrace();
        }
        catch (InputMismatchException erro){
            System.out.println("\nDigite apenas número");
            erro.printStackTrace();
        }
    }
}
