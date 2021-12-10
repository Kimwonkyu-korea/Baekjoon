import java.util.Scanner;

public class arr2577int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[10];
		int mul = a*b*c;

		int num = 0;
		while(mul > 0) {
			int count = 0;
			num = mul%10;
			mul /= 10;
			for(int i=0; i < arr.length; i++) {
				
				arr[i]=i; // 1~9 넣음
				if(arr[i]==num) { // 비교
					// System.out.println(num);
					count++;
				}
			}
			 System.out.println(count);
		}
	}
}
