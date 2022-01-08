package oop;

class Rectangle
{
	int l,b;
	Rectangle(int length, int breadth)
	{
		l=length;
		b=breadth;
	}
    int area()
    {
        return (l*b);
    }
    int perimeter()
    {
    	return(2*(l+b));
    }
}
class Square extends Rectangle
{
	int s;
	Square(int side)
	{
		super(side,side);
		s=side;
	}
	int area()
	{
		System.out.println("Area of rectangle: "+super.area());
		return (s*s);
	}
	int perimeter()
    {
		System.out.println("Perimeter of rectangle: "+super.perimeter());
    	return(4*s);
    }
}
public class B40 
{
    public static void main(String[] args) 
    {
        Square ob = new Square(5);
        int a = ob.area();
        System.out.println("Area of square: "+a);
        int p = ob.perimeter();
        System.out.println("Perimeter of square: "+p);
    }
}