package com.src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class I6
{
    public static void main(String[] args)  
    {
    	int i,j,l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        String a[] = new String[l];
        Set<String> m = new HashSet<String>();
        System.out.println("Enter "+l+" strings: ");
        for (i=0; i<l; i++) 
            a[i] = sc.next();
        for (i=0; i<l; i++)
        {
        	for(j=i+1; j<l; j++)
        	{
        		if(a[i].equals(a[j]))
        			m.add(a[i]);
        	}
        }
        System.out.println("Elements with duplicate entries: "+m);
        
    }
}