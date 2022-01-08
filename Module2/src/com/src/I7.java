package com.src;

import java.util.Scanner;

public class I7
{
    public static void main(String[] args)  
    {
    	int i,l,max2,max;
    	boolean m=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        if(l<2)
        	System.out.println("Invlaid Input");
        else
        {
        int a[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
            a[i] = sc.nextInt();
        max2=Math.min(a[0], a[1]);
        max=max2;
        for (i=0; i<l; i++)
        {
        	if(a[i]>max)
        	{
        		max2=max;
        		max=a[i];
        	}
        	else if(max2<a[i])
        		max2=a[i];
        }
        System.out.println("2nd largest number of Array: "+max2);
        }
    }
}