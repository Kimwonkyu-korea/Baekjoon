package for_1;

import java.util.Scanner;

public class for8393 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;	// 합계 값 초기화
		
		for(int i = 1; i <= n; i++) {		// i는 n까지 
			sum += i;
		}
		System.out.println(sum);
	}

}
