import java.util.Scanner;

public class for10871 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
			//System.out.println(arr[i]<x);
		}
		for(int i=0; i<n; i++) {
			if(arr[i] < x)
			System.out.print(arr[i]+" ");
		}
	}
}