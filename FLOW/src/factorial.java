import java.util.Scanner;

public class factorial {

	
	public static void main(String[] args) {
		
int n;
long fact=1;
System.out.println("enter the number");
Scanner Sc=new Scanner(System.in);
 n=Sc.nextInt();
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println("the factorial: " +fact);

	}

}
