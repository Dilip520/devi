import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the n value:");
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.println("a\t");
	}
	System.out.println("\t");	
}

	}
}
