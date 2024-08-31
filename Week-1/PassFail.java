import java.util.Scanner; 
class PassFail
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Marks: ");
		int marks=sc.nextInt();
		if (marks<50)
		{
			System.out.print("Fail");
		}
		else 
		{
			System.out.print("Pass");
		}
	}
}
		
