
public class overload {
	void add(int x,int y,int z)
	{
		System.out.println( x+y+z);
	}
	void add()
	{
		System.out.println("2nd");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload oa=new overload();
	          oa.add(1,2,3);
		oa.add();
	}

}
