package buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String str=bf.readLine();
		System.out.println(str);

	}

}
