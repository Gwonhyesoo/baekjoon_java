package for¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2741 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter (new OutputStreamWriter(System.out));
		int n = Integer.parseInt(in.readLine());
		
		
		for (int i=1; i<=n; i++) {
			
			out.write(i+"\n");
			
		}
		out.flush();
	}

}
