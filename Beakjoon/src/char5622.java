import java.util.Scanner;

public class char5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String Str = sc.next();

		int sum = 0;

		for(int i =0; i < Str.length(); i++) {
			char c = Str.charAt(i);
			// ���ĺ��� ABC �� �ϳ���� + 3��
			if (c >= 'A' && c <= 'C') {
				sum += 3;
				// ���ĺ��� DEF �� �ϳ���� + 4��
			} else if (c >= 'D' && c <= 'F'){
				sum +=4;
				// ���ĺ��� GHI �� �ϳ���� + 5��
			} else if (c >= 'G' && c <= 'I'){
				sum +=5;
				// ���ĺ��� JKL �� �ϳ���� + 6��
			}else if (c >= 'J' && c <= 'L'){
				sum +=6;
				// ���ĺ��� MNO �� �ϳ���� + 7��
			}else if (c >= 'M' && c <= 'O'){
				sum +=7;
				// ���ĺ��� PQRS �� �ϳ���� + 8��
			}else if (c >= 'P' && c <= 'S'){
				sum +=8;
				// ���ĺ��� TUV �� �ϳ���� + 9��
			}else if (c >= 'T' && c <= 'V'){
				sum +=9;
				// ���ĺ��� WXYZ �� �ϳ���� + 10��
			}else if (c >= 'W' && c <= 'Z'){
				sum +=10;
			}
		}
		System.out.println(sum);
	}
}
