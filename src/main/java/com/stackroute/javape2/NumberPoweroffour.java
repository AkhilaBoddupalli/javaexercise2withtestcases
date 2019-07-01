package com.stackroute.javape2;
import java.lang.Math;

public class NumberPoweroffour {
    public static boolean checkNumber(int num) {
        if(num<=0){
            return false;
        }

        while(num > 1){
            if(num % 4 != 0){
                return false;
            }
            num = num / 4;
        }
        return true;
    }

}





