import java.util.Scanner;

public class char2941 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); 

		String str = sc.nextLine();

		String Str1 = str.replace("c=","c");
		String Str2 = Str1.replace("c-","c");
		String Str3 = Str2.replace("dz=","c");
		String Str4 = Str3.replace("d-","c");
		String Str5 = Str4.replace("lj","c");
		String Str6 = Str5.replace("nj","c");
		String Str7 = Str6.replace("s=","c");
		String Str8 = Str7.replace("z=","c");
		
		System.out.println(Str8.length());
	}
}
