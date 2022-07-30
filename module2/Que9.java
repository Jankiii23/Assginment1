package module2;

class Print
{
	public void printmethod(int n,char c)
	{
		System.out.println("The integer Value is :"+n);
	}
	public void printmethod(char c,int n)
	{
		System.out.println("The Character value is :"+c);
	}
}

public class Que9 
{
	public static void main(String[] args)
	{
		Print p=new Print();
		p.printmethod(100, 'A');
		p.printmethod('b', 190);
		
	}

}
