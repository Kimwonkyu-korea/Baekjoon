import java.util.Scanner;

public class char2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		
		String a1 = (num1.charAt(0)+"");
		String b1 = (num1.charAt(1)+"");
		String c1 = (num1.charAt(2)+"");
		String Str1 = c1+b1+a1;
		int result1 = Integer.parseInt(Str1);

		String a2 = (num2.charAt(0)+"");
		String b2 = (num2.charAt(1)+"");
		String c2 = (num2.charAt(2)+"");
		String Str2 = c2+b2+a2;
		int result2 = Integer.parseInt(Str2);

		if (result1 < result2) {
			System.out.println(result2);
		} else if (result1 > result2) {
			System.out.println(result1);
		}
	
	}
}
