import java.util.Scanner;

public class while1110 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int count = 0;
		int copy = N;
        
		while (true) {
			// ((N % 10) * 10) : �Է¹��� ���� 10 ���� �� ������ �� ���ϱ� 10 -> ù��° �ڸ���
			// (((N / 10) + (N % 10)) % 10) : (�Է�/������10 + �Է�/������10)������10 -> �ι�° �ڸ���
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(count);
	}
}
