package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        int temperature = 15;
        int ageSensei = 33;
        System.out.println(mojno(temperature, ageSensei));
        System.out.println(mojno(generateRendomAge(), ageSensei));
        boolean isRain = false;
        mojno(temperature, ageSensei);
        atNighs();
        secretGoods( "ifAvailable ", 22,12, " WeBuy");
        secretDrift( "во время дрифта ", 8,  5, "градусов ", "опасно для вашей жизни!!!");
        secretDorado("если матрышка ест", 3.5F, 2, "шт бананов то, ей станет плохо");


    }

    public static String mojno(int temperature, int ageSensei) {

        if (temperature < 30 || temperature > -20 && ageSensei < 45 || ageSensei > 20) {
            return "Можно идти гулять";
        }
        if (temperature < -25 || temperature > 30 && ageSensei < 35 || ageSensei > 40) {
            return "Можно идти гулять";
        }
        if (temperature < -2 || temperature > 23 && ageSensei < 24 || ageSensei > 38) {
            return "Можно идти гулять";
        }
        else{
            return "оставаться дома!";
        }
    }



    public static void atNighs(){
        System.out.println("kill a mosquito");
    }

    public static void secretGoods(String text, int num1, int num2, String text2){
        System.out.print(text );
        System.out.print(num1 + num2);
        System.out.println( text2);
    }
    public static void secretDrift(String text, float num1, float num2, String text2, String text3){
        System.out.print(text);
        System.out.print(num1 * num2);
        System.out.print(text2);
        System.out.println(text3);
    }
    public static void secretDorado(String text, float num1,float num2, String text2){
        System.out.print(text);
        System.out.print(num1 * num2);
        System.out.println(text2);
    }
    public static int generateRendomAge(){ //дополнительный д/з
        Random random = new Random();
        return random.nextInt(20);
    }

}