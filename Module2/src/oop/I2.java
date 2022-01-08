package oop;

abstract class Shape
{
	abstract void RectangleArea(int length, int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(double radius);
}
class Area extends Shape
{
	@Override
	void RectangleArea(int length, int breadth) 
	{
		System.out.println("Area of Rectangle: "+(length*breadth));
	}
	@Override
	void SquareArea(int side) 
	{
		System.out.println("Area of Square: "+(side*side));
	}
	@Override
	void CircleArea(double radius) 
	{
		System.out.println("Area of Circle: "+(radius*radius*3.1416));
	}
}
public class I2
{
	public static void main(String[] args) 
	{
		Area ob = new Area();
		ob.RectangleArea(3, 4);
		ob.SquareArea(4);
		ob.CircleArea(7);
	}
}
