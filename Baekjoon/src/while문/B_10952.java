package while¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_10952 {

	public static void main(String[] args) throws IOException {
	
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

while(true) {
	StringTokenizer st = new StringTokenizer(reader.readLine());

	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	
if(a==0&&b==0) {
	break;
}
writer.write(a+b + "\n");

}
writer.flush();

	}
}