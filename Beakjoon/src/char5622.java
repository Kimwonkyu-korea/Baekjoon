import java.util.Scanner;

public class char5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while(true) {
			// ���ڿ��� �ϳ��� �Է� 
			int read = sc.nextInt();

			// Enter�� �ԷµǸ� break; 
			if(read < 'A') 
				break; 
			// �� ���ڸ��� ���� ��� 
			else if(read < 'D') 
				sum += 3; 
			else if(read < 'G') 
				sum += 4; 
			else if(read < 'J') 
				sum += 5; 
			else if(read < 'M') 
				sum += 6; 
			else if(read < 'P') 
				sum += 7; 
			else if(read < 'T') 
				sum += 8; 
			else if(read < 'W') 
				sum += 9; 
			else if(read < '[') 
				sum += 10; 
			} 
		// ��� ��� 
		System.out.print(sum); 
	}
}
