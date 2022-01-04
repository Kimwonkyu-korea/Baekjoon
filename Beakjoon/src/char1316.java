import java.util.Scanner;

public class char1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count=0;
		for(int i=0; i<N; i++) {
			String Str = sc.next();

			String split[] = Str.split("");
			System.out.println(split.length);
			
			for(int j=0; j < split.length; j++) {

				if((split[j].equals(split[j+1]))){
					System.out.println("같다");
				} else {
					System.out.println("같지 않다");
				}
			}
			System.out.println(count);
		}
	}
}
