package com.example.sp;

import java.text.DecimalFormat;

public class Formula {
    public static DecimalFormat currency1 = new DecimalFormat("###########,############.####");
    public static double plus(double a,double b)
    {
        return  Double.parseDouble(currency1.format(a+b));
    }
    public static double minus(double a,double b)
    {
        return  Double.parseDouble(currency1.format(a-b));
    }
    public static double multiplication(double a,double b)
    {
        return  Double.parseDouble(currency1.format(a*b));
    }
    public static double division(double a,double b)
    {
        return  Double.parseDouble(currency1.format(a/b));
    }
}

