import java.util.Scanner;

public class for15552 {

	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
	        int count = sc.nextInt();
	        int a = 0;
	        int b = 0;
	        int [] result = new int[count];	// �Է��� �� ũ�⸸ŭ �迭 ����
	        for(int i=0; i<count; i++) {
	            a = sc.nextInt();
	            b = sc.nextInt();
	            result[i] = a+b;	// ���� ���� �迭�� ������� �־���
	        }
	        
	        for(int i=0; i<result.length; i++) {
	            System.out.println(result[i]);	// ���
	        }
	        sc.close();
	}
}
