package com.array;

import java.io.*;
import java.util.LinkedList;

public class LinkList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> ll=new LinkedList<Integer>();

        for(int i=0; i<=5; i++)
            ll.add(i);

        System.out.println(ll);

        ll.remove(3);

        for(int i=0; i<ll.size(); i++)
            System.out.println(ll.get(i) + "");
    }
}
