package oop;

public class B41
{
    int area(int a,int b)
    {
        return ((int)(0.5*a*b));
    }
    int perimeter(int a, int b, int c)
    {
        return (a+b+c);
    }
    public static void main(String[] args) 
    {
        B41 ob = new B41();
        int a = ob.area(3, 4);
        int p = ob.perimeter(3, 4, 5);
        System.out.println("Area of triangle: "+a);
        System.out.println("Perimeter of triangle: "+p);
    }
}