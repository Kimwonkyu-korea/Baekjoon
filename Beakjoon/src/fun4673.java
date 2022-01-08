public class fun4673 {

	public static void main (String[] args){
		// 셀프넘버를 체크할 배열 생성
		int check[] = new int[10001];

		// 1~10000까지 돌면서 셀프넘버가 아니면 1을 넣음
		for (int i=1; i<10001; i++){
			int n = d(i);
			if (n < 10001){
				check[n] = 1;
			}
		}
		// check 배열을 돌면서 셀프넘버를 출력
		for (int j=1; j<10001; j++){
			if (check[j] == 0){
				System.out.println(j);
			}
		}
	}

	public static int d(int num){
		// 입력 값을 미리 더함
		int sum = num;

		// 반복문을 통해서 0이 될 때까지 검증
		while(num > 0){
			// 일의 자리 숫자를 더함
			sum = sum + (num % 10);
			// 10을 나눠서 일의 자리 숫자를 십의 자리 숫자로 바꿈
			num = num / 10;
		}

		return sum;
	}
}
