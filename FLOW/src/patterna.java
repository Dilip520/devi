import java.util.Scanner;

public class patterna {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		// TODO Auto-generated method stub
for(int i=0;i<=n;i++)
{
	for(int j=1;j<i;j++)
	{
		System.out.println("@");
	}
}
	}

}
