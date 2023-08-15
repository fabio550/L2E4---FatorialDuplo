package view;
import controller.FatorialDuploController;

public class Principal {
    public static void main(String[] args) {
        FatorialDuploController fdc = new FatorialDuploController();

        int res = fdc.CalcFatorialDuplo(5);

        System.out.println(res);
    }
}
