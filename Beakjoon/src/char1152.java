import java.util.Scanner;

public class char1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();

		String trimStr = A.trim();
		String split[] = trimStr.split(" ");
		if(A.equals(" ") || A.equals("")) {
			System.out.print(0);
		}else {
			System.out.print(split.length);
		}
	}
}