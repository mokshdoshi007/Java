package oop;

public class B37
{
    int area(int l,int b)
    {
        return (l*b);
    }
    int area(int s)
    {
        return (s*s);
    }
    public static void main(String[] args) 
    {
        B37 ob = new B37();
        System.out.println("Area of rectangle with sides 10 and 5 is "+ob.area(10,5));
        System.out.println("Area of square with side 3 is "+ob.area(3));
    }
}