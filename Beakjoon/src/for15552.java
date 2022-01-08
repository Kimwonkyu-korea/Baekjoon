import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import jdk.internal.org.jline.utils.InputStreamReader;

public class for15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for(int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");
		}
		bw.close();
		br.close();
	}
}
