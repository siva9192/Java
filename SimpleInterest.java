import java.util.Scanner;
class SimpleInterest {
	public static void main(String [] args) {
	int p,t,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the price");
	p=sc.nextInt();
	System.out.println("enter the time");
	t=sc.nextInt();
	System.out.println("Enter Rate");
	r=sc.nextInt();
	System.out.println(p*t*r/100);
	}
}
