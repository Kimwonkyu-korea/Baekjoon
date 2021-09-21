import java.util.Scanner;

public class while1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		
		while(true) {
			int num_1 = temp / 10;
			int num_2 = temp % 10;
			temp =  (num_2 * 10) + (num_1 + num_2) % 10;
			count++;
			
			if(num == temp) {
				break;
			}
		}
		System.out.println(count);
	}
}
