//1.5 PrintNumberInWords
import java.util.Scanner; 
class PrintNumberInWords
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		if (number==1)
		{
			System.out.print("One");
		}
		else if (number==2)
		{
			System.out.print("Two");
		}
		else if (number==3)
		{
			System.out.print("There");
		}
		else if (number==4)
		{
			System.out.print("Four");
		}
		else if (number==5)
		{
			System.out.print("Five");
		}
		else if (number==6)
		{
			System.out.print("Six");
		}
		else if (number==7)
		{
			System.out.print("Seven");
		}
		else if (number==8)
		{
			System.out.print("Eight");
		}
		else if (number==9)
		{
			System.out.print("Nine");
		}
	}
}