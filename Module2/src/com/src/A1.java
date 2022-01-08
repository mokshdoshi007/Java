package com.src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A1
{
    public static void main(String[] args)  
    {
    	int i,j,l1,l2;
    	Set<String> m = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st array length: ");
        l1=sc.nextInt();
        String a[] = new String[l1];
        System.out.println("Enter "+l1+" strings: ");
        for (i=0; i<l1; i++) 
            a[i] = sc.next();
        System.out.println("Enter 2nd array length: ");
        l2=sc.nextInt();
        String b[] = new String[l2];
        System.out.println("Enter "+l2+" strings: ");
        for (i=0; i<l2; i++) 
            b[i] = sc.next();
        for (i=0; i<l1; i++)
        {
        	for(j=0; j<l2; j++)
        	{
        		if(a[i].equals(b[j]))
        			m.add(a[i]);
        	}
        }
        System.out.println("Common elements: "+m);
        
    }
}