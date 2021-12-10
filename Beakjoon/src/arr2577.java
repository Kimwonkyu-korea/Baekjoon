import java.util.Scanner;

public class arr2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int number = (num1*num2*num3);
		String str = number + ""; 
		// System.out.println(str);
		
		String split[] = str.split("");
		
		for(int i=0; i <= 9; i++) {
			int count = 0;
			String inum = i + "";
			for(int j=0; j < split.length; j++) {
				if(split[j].equals(inum)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
