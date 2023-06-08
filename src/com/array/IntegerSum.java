package com.array;

import java.util.Scanner;

public class IntegerSum
{
    public static void main(String args[])
    {
        Scanner scaninput=new Scanner(System.in);

        System.out.println("The Two Number is:");
        int a=scaninput.nextInt();
        int b=scaninput.nextInt();

        scaninput.close();

        System.out.println("The sum of two numbers is:"+Integer.sum(a,b));
    }
}
