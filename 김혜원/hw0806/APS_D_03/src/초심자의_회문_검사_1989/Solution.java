package 초심자의_회문_검사_1989;

import java.io.File;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		File file = new File("src/초심자의_회문_검사_1989/input_1989.txt");
		Scanner sc = new Scanner(file);
		//Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		sc.nextLine();
		
		for(int t = 1; t <= TC ; t++) {
			String str = sc.nextLine();
			int l = str.length();
			int result =1;
			for(int i = 0; i < (l/2); i++) {
				if(str.charAt(i) != str.charAt(l-1-i)) {  //이부분 -1누락하시면 안되세요
					result = 0; break;
				}
			}//문자 인덱스 이동하면서 앞뒤 비교
			
			System.out.println("#"+t+" "+result);
		}//TC-for
		
	}//main
}
