package view;
import controller.FatorialDuploController;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        FatorialDuploController fdc = new FatorialDuploController();

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        int res = fdc.CalcFatorialDuplo(num);

        JOptionPane.showMessageDialog(null, "O fatorial duplo de " + num + " é " + res); // 5 -> 15
    }
}
