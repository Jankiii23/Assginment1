package module2;
class Triangle
{
	int perimeter(int a,int b,int c)
	{
		int perimeter = a+b+c;
		return perimeter;
	}
	int area(int lenth,int height)
	{
		int area = lenth*height;
		return area;
	}
}

public class Que14 
{
	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();
		t1.area(56, 90);
		t1.perimeter(8, 0, 4);
		System.out.println(t1.perimeter(8, 0, 4));
		
	}

}
