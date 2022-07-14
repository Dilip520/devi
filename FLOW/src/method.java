
public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="Hello World";
     String      s1="myfarm";
     String sf1=s1.format("name is %S",s1);
    System.out.println("index of w: " + s.indexOf('W'));
    System.out.println("character at 4: " + s.charAt(4));
    System.out.println("index of l: " + s.indexOf(4,'l'));
    System.out.println("substring: " + s.substring(5));
    System.out.println("format : " + sf1);
    System.out.println("substring1: " + s.substring(2,5));
    System.out.println("Uppercase: " + s.toUpperCase());
    System.out.println("lowercase: " + s.toLowerCase());
     String[] s2=s.split(" ");
     
	}

}
