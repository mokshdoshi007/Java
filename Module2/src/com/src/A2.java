package com.src;

import java.util.Scanner;

public class A2
{
    public static void main(String[] args)  
    {
    	int i,l,min,max,s=0;
    	boolean m=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        if(l>2)
        {
        int a[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
        {
            a[i] = sc.nextInt();
            s+=a[i];
        }
        min=a[0];
        max=a[0];
        for (i=1; i<l; i++)
        {
        	if(a[i]<min)
        		min=a[i];
        	if(a[i]>max)
        		max=a[i];
        }
        System.out.println("Average except largest and smallest values of Array: "+(double)(s-min-max)/(l-2));
        }
        else
        	System.out.println("Invalid Input");
    }
}