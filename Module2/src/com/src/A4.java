package com.src;

import java.util.Scanner;

public class A4
{
    public static void main(String[] args)  
    {
    	int i,l,c1=0,c2;
    	boolean m=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        c2=l;
        int a[] = new int[l];
        int b[] = new int[l];
        System.out.println("Enter 0 or 1, "+l+" times");
        for (i=0; i<l; i++) 
        {    
        	a[i] = sc.nextInt();
        	if(a[i]==0 || a[i]==1)
        	
        	{
        	if(a[i]==0)
        	{
        		 b[c1]=0;
        		 c1++;
        	}
        	else
        	{
        		c2--;
        		b[c2]=1;
        	}
        	}
        	else
        	{
        		System.out.println("Re-enter last value");
        		i--;
        	}
        }
        System.out.println("Segregated Array: ");
        for (i=0; i<l; i++) 
            System.out.print(b[i]+" ");
    }
}