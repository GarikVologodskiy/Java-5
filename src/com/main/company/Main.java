package com.main.company;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        //var a = 11;
        //var x1 = 10;
        int x = Integer.MAX_VALUE;
        System.out.println("x = " + x);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        long y = Long.MAX_VALUE;
        System.out.println("Long.MAX_VALUE = " + y);

        short z = Short.MAX_VALUE;
        System.out.println("Short.MAX_VALUE = " + z);

        byte b = Byte.MAX_VALUE;
        System.out.println("Byte.MAX_VALUE = " + b);

        double d = Double.MAX_VALUE;
        //var var1 = 0.1d + 0.2d;
        System.out.println("Double.MAX_VALUE " + d);
        //String var1;
        //System.out.println("var1 = " + var1);

        float f = Float.MAX_VALUE;
        float p = 1.6f;
        System.out.println("Float.MAX_VALUE " + f);
        System.out.println("p = " + p);

        char c = 65_535 - 2222;
        c = 'f';
        System.out.println("c = " + c);

        int x1 = 0;
        int a1 = ++x1; //a1 = 11
        //int a1 = x1++; //a1 = 10
        System.out.println("a1 = " + a1);

        //boolean b = true;
        //boolean b1 = false;

/* do while */
        //do {
        //  System.out.println("Hello");
        //a++;
        //} while (a < 10);

        //}
        // }
/*for */
        //for (x = 0; x < 10; x += 1) {
          //  System.out.println(x);
            //if (x > 10)
              //  x += x;

/* foreach array */
        //int[] arr = {1,2,3,4,5,6,7,8,9};
        //for (x = 0; x < arr.length; x ++){
          //  System.out.println("arr = " + arr[x]);

        /* array */
        //int[]room;

        //for(expr1;expr2;expr3) {
          //  body1
        //if (expr4) continue;
          //body2
        //}

        String s1 = "WhereI.m)";
        String s2 =  new String ("WhereI.m)");
        String s3 = s2.intern();
        //System.out.println(s1.charAt(0));
        //System.out.println(s1.charAt(1));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
                    }
    }
