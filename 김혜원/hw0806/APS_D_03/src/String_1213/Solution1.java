package String_1213;

import java.io.File;
import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/String_1213/test_input_1213.txt");
		Scanner sc = new Scanner(file);
		//Scanner sc = new Scanner(System.in);
		
		for(int t = 0; t < 10; t++) {
			int TC = sc.nextInt();
			sc.nextLine();
			
			String p = sc.nextLine();
			String s = sc.nextLine();
			int pNum = p.length();
			int sNum = s.length();
			int count = 0;
			
			outer : for(int i = 0; i<sNum - pNum +1; i++) {
				for(int j = 0; j < pNum; j++) {
					if(p.charAt(j) != s.charAt(i+j)) {
						continue outer;
					}//패턴 틀린거 확인되면 반복탈출+문장 인덱스 이동
					
				}//패턴 맞는지 체크
				count++;
			}//문장 인덱스 옆으로 이동
			System.out.println("#"+TC+" "+count);
		}//TC-for
		
	}//main
}
