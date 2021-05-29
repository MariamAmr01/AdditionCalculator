import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        long a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter two numbers to be added");
		System.out.println("1st number: ");
		a=input.nextLong();
		System.out.println("2nd number: ");
		b=input.nextLong();
		c=a+b;
		System.out.println(a+"+" + b+"="+c);
		input.close();
	}

}
