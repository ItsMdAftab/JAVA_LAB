//1.6 PrintDayInWord (neste//1.5 PrintNumberInWords
import java.util.Scanner; 
class PrintDayInWords
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		if (number==0)
		{
			System.out.print("Monday");
		}
		else if (number==1)
		{
			System.out.print("Tuesday");
		}
		else if (number==2)
		{
			System.out.print("Thursday");
		}
		else if (number==3)
		{
			System.out.print("Friday");
		}
		else if (number==4)
		{
			System.out.print("Saturday");
		}
		else if (number==5)
		{
			System.out.print("Sunday");
		}
	}
}
