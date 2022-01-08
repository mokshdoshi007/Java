package com.src;

import java.util.Scanner;

public class I2
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
        for (i=0; i<l; i++)
        	b[i]=a[i];
        System.out.println("Copied Array: ");
        for (i=0; i<l; i++) 
            System.out.print(b[i]+" ");
    }
}