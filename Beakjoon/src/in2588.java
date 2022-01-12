import java.util.Scanner;

public class in2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result1 = (num2%10);
		int re1 = result1*num1;
		System.out.println(re1);
		
		int result2 = (num2%100)/10;
		int re2 = result2*num1;
		System.out.println(re2);
		
		int result3 = num2/100;
		int re3 = result3*num1;
		System.out.println(re3);
		
		
		System.out.println(re1+(re2*10)+(re3*100));
	}
}
