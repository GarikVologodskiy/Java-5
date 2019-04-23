package com.main.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        var a = 11;
        var x1 = 10;
        int x = Integer.MAX_VALUE;
        System.out.println("x = " + x);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE );       

        long y = Long.MAX_VALUE;
        System.out.println("Long.MAX_VALUE = " + y);

        short z = Short.MAX_VALUE;
        System.out.println("Short.MAX_VALUE = " + z);

        byte b = Byte.MAX_VALUE;
        System.out.println("Byte.MAX_VALUE = " + b);

        double d = Double.MAX_VALUE;
        var var1 = 0.1d + 0.2d;
        System.out.println("Double.MAX_VALUE " + d);
        System.out.println("var1 = " + var1);

        float f = Float.MAX_VALUE;
        float p = 1.6f;
        System.out.println("Float.MAX_VALUE " + f);
        System.out.println("p = " + p);

        char c = 65_535 - 2222;
        c = 'f';
        System.out.println("c = " + c);

        int a1 = ++x1; //a1 = 11

        //int a1 = x1++; //a1 = 10
        System.out.println("a1 = " + a1);



        //boolean b = true;
        //boolean b1 = false;
    }
}
//var x = 0;
//while(x<100):{
//for(x = 0; x < 10; x++) {
//  System.out.println(x);
//}
//}