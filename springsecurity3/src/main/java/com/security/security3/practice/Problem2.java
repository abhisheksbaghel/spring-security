package com.security.security3.practice;

public class Problem2 {

    public static void main(String[] args) {

        int []arr= { 5, 3, 4, 2, 6, 8};
        int res[]= new int[arr.length];
        int temp=0;
        int count=0;
        int prod=1;

        for(int i=0;i< arr.length;i++)
        {
            temp=arr[i];
            arr[i]=1;

            while(count< arr.length)
            {
                prod= prod*arr[count];
                res[i]=prod;
                count++;
            }
            count=0;
            arr[i]=temp;
            prod=1;

        }

        for (int i: res)
        {
            System.out.println(i);
        }


    }

}
