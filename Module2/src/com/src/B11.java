package com.src;

import java.util.Scanner;

public class B11 
{
    public static void main(String[] args)  
    {
    	int i,j,l, t;
    	String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l];
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
            a[i] = sc.nextInt();
        for (i=0; i<l; i++) 
        {
            for (j=i+1; j<l; j++) 
            { 
                if (a[i]>a[j]) 
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for (i=0; i<l; i++) 
            System.out.print(a[i]+" ");
        System.out.println("\nEnter array length: ");
        l=sc.nextInt();
        String b[] = new String[l];
        System.out.println("Enter "+l+" strings: ");
        for (i=0; i<l; i++) 
            b[i] = sc.next();
        for (i=0; i<l; i++) 
        {
            for (j=i+1; j<l; j++) 
            { 
                if (b[i].compareTo(b[j])>0) 
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for (i=0; i<l; i++) 
            System.out.print(b[i]+" ");
    }
}