import java.util.Scanner;

public class while10952 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("첫번째 숫자 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두번째 숫자 입력 : ");
			int num2 = sc.nextInt();
			
			System.out.println("합계 : "+ (num1 + num2));
			
			if(num1 == 0 && num2 ==0) {
				break;
			}
			
		}
		
	}

}
