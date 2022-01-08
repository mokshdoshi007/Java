package com.src;

import java.util.Scanner;

public class A3
{
    public static void main(String[] args)  
    {
    	int i,l,c=0;
    	boolean m=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
        {    
        	a[i] = sc.nextInt();
        	if(a[i]==10)
        		c++;
        }
        if(c==3)
        	System.out.println("True");
        else
        	System.out.println("False");
    }
}