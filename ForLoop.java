import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number whose factorial you want to find:");
	int num = scanner.nextInt();
	long factorial = 1;
	for (int i=1; i<=num; i++)
	{
		factorial = factorial * i;
	}
	System.out.println("The factorial is: " + factorial);
	}

}
