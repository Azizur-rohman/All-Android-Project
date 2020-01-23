package com.example.sp;

import java.text.DecimalFormat;

public class covertformula {
    public  static double celsius2farenheit(double c){
        return  Double.parseDouble(currency1.format(32+c*9/5));
    }
    public static double farenheit2celsius(double f){
        return  Double.parseDouble(currency1.format((f-32)*5/9));
    }
    public static double currency(double cu){
        return  Double.parseDouble(currency1.format(cu*85));
    }
    public static double ccurrency(double ccu){
        return  Double.parseDouble(currency1.format( ccu/85));
    }
   public static DecimalFormat currency1 = new DecimalFormat("###########,#############.#####");







}
