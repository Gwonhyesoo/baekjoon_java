package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine()); //스트링토크나이저, 문자열을 토큰화한다. 즉, 토큰은 분리된 문자열 조각 
			
			int a = Integer.parseInt(st.nextToken()); //nexttoken은 다음 토큰을 반환
			int b = Integer.parseInt(st.nextToken());
			
			int res = a+b;
			
			writer.write("Case #"+(i+1)+": "+res+"\n");
					
					
		}
		writer.flush();
	}

}
