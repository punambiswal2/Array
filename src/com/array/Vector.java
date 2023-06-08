package com.array;

import java.io.*;
import java.util.*;


public class Vector
{
    public static void main(String[] args)
    {
        java.util.Vector<Integer> v=new java.util.Vector<Integer>();

        for(int i=1; i <=5; i++)
            v.add(i);

        System.out.println(v);

        v.remove(3);

        for(int i=0; i<v.size(); i++)
            System.out.println(v.get(i) + "");
    }
}
