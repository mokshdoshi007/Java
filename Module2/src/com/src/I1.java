package com.src;

import java.util.Scanner;

public class I1
{
    public static void main(String[] args)  
    {
    	int i,j,l,s,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
            a[i] = sc.nextInt();
        System.out.println("Enter a number to remove from array: ");
        s=sc.nextInt();
        for (i=0; i<l; i++)
        {
        	if(a[i]==s)
        	{
        		l--;
        		for(j=i;j<l;j++)
        			a[j]=a[j+1];
        	}
        }
        System.out.println("Updated Array: ");
        for (i=0; i<l; i++) 
            System.out.print(a[i]+" ");
    }
}