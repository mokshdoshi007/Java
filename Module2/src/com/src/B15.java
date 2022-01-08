package com.src;

import java.util.Scanner;

public class B15
{
    public static void main(String[] args)  
    {
    	int i,l,s,j=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
            a[i] = sc.nextInt();
        System.out.println("Enter a number to find index: ");
        s=sc.nextInt();
        for (i=0; i<l; i++)
        {
        	if(a[i]==s)
        	{
        		j=i;
        		break;
        	}
        }
        if(j==-1)
        System.out.println("Number is not present in Array");
        else
        System.out.println("Number is present in Array at index: "+j);
    }
}