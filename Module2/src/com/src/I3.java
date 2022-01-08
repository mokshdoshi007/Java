package com.src;

import java.util.Scanner;

public class I3
{
    public static void main(String[] args)  
    {
    	int i,j,l,s,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l+1];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
            a[i] = sc.nextInt();
        System.out.println("Enter a number to insert into array: ");
        s=sc.nextInt();
        System.out.println("Enter index where element is to be inserted: ");
        t=sc.nextInt();
        if(t>=0 && t<=l)
        {
        	for (i=l; i>t; i--)
        		a[i]=a[i-1];
            a[t]=s;
            System.out.println("Updated Array: ");
            for (i=0; i<=l; i++) 
                System.out.print(a[i]+" ");
        }
        else
        	System.out.println("Not possible to insert");
    }
}