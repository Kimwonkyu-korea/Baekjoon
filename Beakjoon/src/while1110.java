import java.util.Scanner;

public class while1110 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int count = 0;
		int copy = N;
        
		while (true) {
			// ((N % 10) * 10) : 입력받은 값을 10 나눈 후 나머지 값 곱하기 10 -> 첫번째 자릿수
			// (((N / 10) + (N % 10)) % 10) : (입력/나누기10 + 입력/나머지10)나머지10 -> 두번째 자릿수
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(count);
	}
}
