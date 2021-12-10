import java.util.Scanner;

public class while10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int sum = A+B;
			
			System.out.println(sum);
		}
	}
}
