import java.util.Scanner;

public class char11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int	num = sc.nextInt();
		
		String st =  sc.next();
		
		int sum = 0;
		
		for(int i=0; i < num; i++) {
			sum += st.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
