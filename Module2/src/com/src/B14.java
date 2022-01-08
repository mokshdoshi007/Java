package com.src;

import java.util.Scanner;

public class B14 
{
    public static void main(String[] args)  
    {
    	int i,l,s;
    	boolean m=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
            a[i] = sc.nextInt();
        System.out.println("Enter a number to search: ");
        s=sc.nextInt();
        for (i=0; i<l; i++)
        {
        	if(a[i]==s)
        	{
        		m=true;
        		break;
        	}
        }
        if(m==true)
        System.out.println("Number is present in Array");
        else
        System.out.println("Number is not present in Array");
    }
}