import java.util.Scanner;

public class while10952 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("ù��° ���� �Է� : ");
			int num1 = sc.nextInt();
			
			System.out.print("�ι�° ���� �Է� : ");
			int num2 = sc.nextInt();
			
			System.out.println("�հ� : "+ (num1 + num2));
			
			if(num1 == 0 && num2 ==0) {
				break;
			}
			
		}
		
	}

}
