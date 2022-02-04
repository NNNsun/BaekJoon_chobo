package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Average {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] score= new int[3];
		for(int i=0;i<score.length;i++) {
			score[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));

	}

}
