package com.array;

import java.io.*;

public interface InterfaceDemo
{
    final int a=10;

    void display();

}

class TestClass implements InterfaceDemo
{
    public void display()
    {
        System.out.println("Punam");

    }

    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
    }
}


