package com.array;

import java.util.Iterator;

public class ArrayList
{
    public static void main(String args[])
    {
        java.util.ArrayList<String> al= new java.util.ArrayList<String>();
        al.add("Nick");
        al.add("Rick");
        al.add("Biki");
        al.add("lol");

        Iterator itr= al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
