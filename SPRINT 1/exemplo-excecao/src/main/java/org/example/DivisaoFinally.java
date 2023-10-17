package org.example;

import javax.swing.*;

public class DivisaoFinally {
    public static void main(String[] args) {
        String snum1, snum2;
        int num1, num2;

        try{
            snum1 = JOptionPane.showInputDialog("Digite um número");
            snum2 = JOptionPane.showInputDialog("Digite outro número");

            num1 = Integer.parseInt(snum1);
            num2 = Integer.parseInt(snum2);

            JOptionPane.showMessageDialog(null, num1 / num2);
        }
        catch (ArithmeticException erro){
            JOptionPane.showMessageDialog(null, "\nDivisão por zero" + erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "\nDigite apenas número" + erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        finally {
            JOptionPane.showMessageDialog(null, "Fim de execução");
        }

    }
}
