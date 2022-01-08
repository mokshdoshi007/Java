package com.src;

import java.util.Scanner;

public class B16
{
    public static void main(String[] args)  
    {
    	int i,l,min,max;
    	boolean m=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
            a[i] = sc.nextInt();
        min=a[0];
        max=a[0];
        for (i=1; i<l; i++)
        {
        	if(a[i]<min)
        		min=a[i];
        	if(a[i]>max)
        		max=a[i];
        }
        System.out.println("Minimum number of Array: "+min);
        System.out.println("Maximum number of Array: "+max);
    }
}