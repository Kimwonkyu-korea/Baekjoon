package for_1;

import java.util.Scanner;

public class for8393 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;	// �հ� �� �ʱ�ȭ
		
		for(int i = 1; i <= n; i++) {		// i�� n���� 
			sum += i;
		}
		System.out.println(sum);
	}

}
