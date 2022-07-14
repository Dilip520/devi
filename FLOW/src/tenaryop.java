
public class tenaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=19;
		boolean haslicense=true;
		boolean candrive=(age>18)? true:false;
		boolean canrentAcar=candrive?(haslicense ? true:false):false;
		System.out.println("age:"+age);
		System.out.println("has licesense:"+haslicense);
		System.out.println("can drive:"+candrive);
		System.out.println("can rent a car:"+canrentAcar);
		
		System.out.println(" ");
		System.out.println("result");
		
	}

}
