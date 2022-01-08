public class fun4673 {

	public static void main (String[] args){
		// �����ѹ��� üũ�� �迭 ����
		int check[] = new int[10001];

		// 1~10000���� ���鼭 �����ѹ��� �ƴϸ� 1�� ����
		for (int i=1; i<10001; i++){
			int n = d(i);
			if (n < 10001){
				check[n] = 1;
			}
		}
		// check �迭�� ���鼭 �����ѹ��� ���
		for (int j=1; j<10001; j++){
			if (check[j] == 0){
				System.out.println(j);
			}
		}
	}

	public static int d(int num){
		// �Է� ���� �̸� ����
		int sum = num;

		// �ݺ����� ���ؼ� 0�� �� ������ ����
		while(num > 0){
			// ���� �ڸ� ���ڸ� ����
			sum = sum + (num % 10);
			// 10�� ������ ���� �ڸ� ���ڸ� ���� �ڸ� ���ڷ� �ٲ�
			num = num / 10;
		}

		return sum;
	}
}
