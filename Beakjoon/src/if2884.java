import java.util.Scanner;

public class if2884 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int H = in.nextInt(); // ��
		int M = in.nextInt(); // ��

		if(M < 45) { // 45�� �̻��̶��
			H--;		// ��(hour) 1 ����
			M= 60 - (45 - M); 	// ��(min) ����
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}