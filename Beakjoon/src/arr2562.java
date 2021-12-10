import java.util.Arrays;
import java.util.Scanner;

public class arr2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];

		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<9; i++) {
			int max = (Arrays.stream(arr).max().getAsInt());
		
			if(arr[i]==max) {
				System.out.println(max);
				System.out.println(i+1);
			}
		}
	}
}
