package com.src;

import java.util.Scanner;

public class A5
{
    public static void main(String[] args)  
    {
    	int i,j,l,s,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l];
        int b[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
            a[i] = sc.nextInt();
        b[0]=a[l-1];
        for (i=0; i<l-1; i++)
        	b[i+1]=a[i];
        System.out.println("Rotated Array: ");
        for (i=0; i<l; i++) 
            System.out.print(b[i]+" ");
    }
}