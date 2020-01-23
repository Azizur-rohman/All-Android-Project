package com.example.mytest1;

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
   public static DecimalFormat currency1 = new DecimalFormat("###########,#############.##");

    public static double weight1(double pound){
        return Double.parseDouble(currency1.format(2.20462*pound));
    }
    public static double weight2(double kg){
        return Double.parseDouble(currency1.format(kg/2.20462));
    }

    public static double times(double t)
    {
        return Double.parseDouble(currency1.format(t*60));
    }
    public static double timem(double j)
    {
        return Double.parseDouble(currency1.format(j*60));
    }
    public static double timeh(double i)
    {
        return Double.parseDouble(currency1.format(i*24));
    }


    public static double times1(double t)
    {
        return Double.parseDouble(currency1.format(t/60));
    }
    public static double timem1(double t)
    {
        return Double.parseDouble(currency1.format(t/60));
    }
    public static double timeh1(double t)
    {
        return Double.parseDouble(currency1.format(t/24));
    }
    public static double lengthc(double a)
    {
        return Double.parseDouble(currency1.format(a*100));
    }
    public static double lengthc1(double a)
    {
        return Double.parseDouble(currency1.format(a/100));
    }
    public static double lengthm(double a)
    {
        return Double.parseDouble(currency1.format(a*1000));
    }
    public static double lengthm1(double a)
    {
        return Double.parseDouble(currency1.format(a/1000));
    }
    public static double lengthk(double a)
    {
        return Double.parseDouble(currency1.format(a*1.60934));
    }
    public static double lengthk1(double a)
    {
        return Double.parseDouble(currency1.format(a/1.60934));
    }



}
