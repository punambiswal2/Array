package com.array;

public class Reverse
{
    public static void main(String args[])
{
  String originalstr  = "Hello";
  String reversestr =" ";

  for(int i=0; i < originalstr.length(); i++) {
      reversestr = originalstr.charAt(i) + reversestr;
  }
      System.out.println("Reverse String is:" +reversestr);

}
}
