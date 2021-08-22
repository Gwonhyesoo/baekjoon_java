package output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(in.readLine());
		
		for (int i=0; i<t; i++) {
		StringTokenizer st = new StringTokenizer(in.readLine()); //입력 문자열 저장할 값
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int res = a+b;
		out.write(res+"\n");
		}
		
		out.flush();
		
		}
}