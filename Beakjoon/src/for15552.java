import java.util.Scanner;

public class for15552 {

	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
	        int count = sc.nextInt();
	        int a = 0;
	        int b = 0;
	        int [] result = new int[count];	// 입력한 값 크기만큼 배열 생성
	        for(int i=0; i<count; i++) {
	            a = sc.nextInt();
	            b = sc.nextInt();
	            result[i] = a+b;	// 더한 값을 배열에 순서대로 넣어줌
	        }
	        
	        for(int i=0; i<result.length; i++) {
	            System.out.println(result[i]);	// 출력
	        }
	        sc.close();
	}
}
