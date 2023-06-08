package com.array;

public class Occurance
{
    public static void main(String[] args)
    {
        int[] nos = {1, 2, 3, 4, 1, 2, 3, 2, 3, 4, 2, 5, 6};
        int key = 2;
        System.out.println("Number of Occurence of 2 is:"+occurence(nos, key));
    }

    static int occurence(int[] nos, int k)
    {
       // Scanner sc=new Scanner(System.in);
        int count = 0;
       // k= sc.nextInt();

        for (int i = 0; i < nos.length; i++) {
            if (nos[i] == k) {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:" + count);
        return count;
    }
}


