package com.test;

import java.util.Scanner;

import com.dao.dao;
import com.model.Student;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dao hbd = new dao();
		Student s1 = new Student();
		int m =1, ch, c=1;
		while (m != 0) {
			System.out.println("1. Insert Data");
			System.out.println("2. Update Data");
			System.out.println("3. Delete Data");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				s1.setSid(c);
				System.out.println("Enter Name : ");
				s1.setSname(sc.next());
				System.out.println("Enter City : ");
				s1.setCity(sc.next());
				hbd.insertstudent(s1);
				c++;
				break;
			case 2:
				System.out.println("Enter Id : ");
				s1.setSid(sc.nextInt());
				System.out.println("Enter Name : ");
				s1.setSname(sc.next());
				System.out.println("Enter City : ");
				s1.setCity(sc.next());
				hbd.updatestudent(s1);
				break;
			case 3:
				System.out.println("Enter Id : ");
				s1.setSid(sc.nextInt());
				hbd.deletestudent(s1);
				break;
			default :
				System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue? (1=Yes 0=No)");
			m = sc.nextInt();
		}
	}
}