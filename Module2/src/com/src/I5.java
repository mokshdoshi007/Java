package com.src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class I5
{
    public static void main(String[] args)  
    {
    	int i,j,l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        l=sc.nextInt();
        int a[] = new int[l];
        Set<Integer> m = new HashSet<Integer>();
        System.out.println("Enter "+l+" numbers: ");
        for (i=0; i<l; i++) 
            a[i] = sc.nextInt();
        for (i=0; i<l; i++)
        {
        	for(j=i+1; j<l; j++)
        	{
        		if(a[i]==a[j])
        			m.add(a[i]);
        	}
        }
        System.out.println("Elements with duplicate entries: "+m);
        
    }
}