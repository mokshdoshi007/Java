package com.src;

import java.util.Scanner;

public class B12 
{
    public static void main(String[] args)  
    {
    	int i,l,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
        {
            a[i] = sc.nextInt();
            s+=a[i];
        }
        System.out.println("Sum of Numbers in Array: "+s);
    }
}