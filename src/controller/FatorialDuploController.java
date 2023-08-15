package controller;

public class FatorialDuploController {
    public FatorialDuploController() {
        super();
    }



    public int CalcFatorialDuplo(int num) {

        if (num % 2 == 0) return 0;

        if (num > 1) {
            return (CalcFatorialDuplo(num - 2) * num);
        } else return num;


    }
}
