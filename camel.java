package guvi;
import java.util.Scanner;
public class camel {
	public static void main(String args[]){
		String a,c="";
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
	String b=a.substring(0,1);
	String d=b.toUpperCase();
	System.out.println(d.concat(a.substring(1,a.length())));
	
}
}
